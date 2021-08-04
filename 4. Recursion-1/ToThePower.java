import java.util.Scanner;

public class ToThePower {

    public static int xToThePowerN(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * xToThePowerN(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(xToThePowerN(x, n));
        sc.close();
    }
}
