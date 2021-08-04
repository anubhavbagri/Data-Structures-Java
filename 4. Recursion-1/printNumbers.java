import java.util.Scanner;

public class printNumbers {

    public static void printNos(int n) {
        if (n == 0) {
            return;
        }
        printNos(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
        sc.close();
    }
}
