import java.util.Scanner;

public class StringToInteger {
    // returns int
    public static int convertStringToInteger(String s) {

        if (s.length() == 1) {
            return Character.getNumericValue(s.charAt(0));
        }

        int indxValue = Character.getNumericValue(s.charAt(0)) * (int) Math.pow(10, s.length() - 1);
        return indxValue + convertStringToInteger(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(convertStringToInteger(S));
        sc.close();
    }
}
