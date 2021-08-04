import java.util.Scanner;

public class LastIndex {

    private static int getLastIndex(int input[], int x, int endIndex) {

        if (endIndex < 0) {
            return -1;
        }

        if (input[endIndex] == x) {
            return endIndex;
        }

        int smallAns = getLastIndex(input, x, endIndex - 1);
        return smallAns;
    }

    public static int getLastIndex(int input[], int x) {
        return getLastIndex(input, x, input.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(getLastIndex(a, x));
        sc.close();
    }
}
