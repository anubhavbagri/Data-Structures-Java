import java.util.Scanner;

public class CheckAB {

    public static boolean checkForAB(String s) {

        if (s.length() == 0) {
            return true;
        }
        if (s.charAt(0) != 'a') {
            return false;
        }
        if (s.length() >= 3 && "abb".equals(s.substring(0, 3))) {
            return checkForAB(s.substring(3));
        } else {
            return checkForAB(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(checkForAB(S));
        sc.close();
    }
}
