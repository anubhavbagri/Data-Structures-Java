import java.util.Scanner;

public class countZeros {

    public static int countZero(int n) {
        if (n % 10 == 0 && n > 0) {
            return 1 + countZero(n / 10);
        } else if (n > 0) {
            return countZero(n / 10);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countZero(N));
        sc.close();
    }
}
