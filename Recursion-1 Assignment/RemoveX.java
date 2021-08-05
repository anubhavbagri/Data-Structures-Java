import java.util.Scanner;

public class RemoveX {

    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }

        String ans = "";
        if (str.charAt(0) != 'x') {
            ans = ans + str.charAt(0);
        }

        String smallAns = removeX(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(removeX(S));
        sc.close();
    }
}
