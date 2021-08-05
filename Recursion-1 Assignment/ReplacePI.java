import java.util.Scanner;

public class ReplacePI {

    private static String replacePi(String s, int startIndex) {

        if (s.charAt(startIndex) == 'p') {
            if (s.charAt(startIndex + 1) == 'i') {
                return s.replaceAll("pi", "3.14");
            } else {
                return s;
            }
        } else {
            return replacePi(s, startIndex + 1);
        }
    }

    public static String replacePi(String s) {
        return replacePi(s, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(replacePi(S));
        sc.close();
    }
}
