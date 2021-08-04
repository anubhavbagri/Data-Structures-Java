import java.util.Scanner;

public class SumArray {

    public static int sum(int input[]) {
        if (input.length == 1) {
            return input[0];
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        int smallAns = sum(smallInput);
        return input[0] + smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a));
        sc.close();
    }
}
