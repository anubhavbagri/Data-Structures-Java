import java.util.Scanner;

public class checkNumberPresence {

    public static boolean isPresent(int input[], int x) {
        if (input.length == 1) {
            return (input[0] == x);
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = isPresent(smallInput, x);
        if (!smallAns) {
            return (input[0] == x);
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(isPresent(a, x));
        sc.close();
    }
}
