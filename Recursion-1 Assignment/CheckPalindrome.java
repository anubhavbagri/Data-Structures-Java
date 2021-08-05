import java.util.Scanner;

public class CheckPalindrome {

    private static boolean checkPalindrome(String S, int startIndex, int lastIndex) {

        if (S.charAt(startIndex) == S.charAt(lastIndex)) {
            if (startIndex >= lastIndex) {
                return true;
            }
            return checkPalindrome(S, startIndex + 1, lastIndex - 1);
        } else {
            return false;
        }
    }

    public static boolean checkPalindrome(String S) {
        return checkPalindrome(S, 0, S.length() - 1);
    }

    public static boolean checkPalindromeAlternative(String input) {
        if (input.length() <= 1) {
            return true;
        } else if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }
        return checkPalindromeAlternative(input.substring(1, input.length() - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(checkPalindrome(S));
        // System.out.println(checkPalindromeAlternative(S));
        sc.close();
    }
}
