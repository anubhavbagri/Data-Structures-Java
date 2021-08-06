import java.util.Scanner;

public class PairStar {

    public static String toPairStar(String str) {
        if (str.length() == 1) {
            return str;
        }

        String ans = "";
        if (str.charAt(0) == str.charAt(1)) {
            ans = ans + str.charAt(0) + "*";
        } else {
            ans = ans + str.charAt(0);
        }

        String smallAns = toPairStar(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(toPairStar(S));
        sc.close();
    }
}
