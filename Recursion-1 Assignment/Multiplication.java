import java.util.Scanner;

public class Multiplication {

    public static int multiply(int m, int n) {
        if (n == 1) {
            return m;
        }
        return m + multiply(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(multiply(M, N));
        sc.close();
    }
}
