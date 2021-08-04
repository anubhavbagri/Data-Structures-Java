import java.util.Scanner;

public class FirstIndex {

    private static int getFirstIndex(int input[], int x, int startIndex) {

        if (startIndex > input.length - 1) {
            return -1;
        }

        if (input[startIndex] == x) {
            return startIndex;
        }

        int smallAns = getFirstIndex(input, x, startIndex + 1);
        return smallAns;
    }

    public static int getFirstIndex(int input[], int x) {
        return getFirstIndex(input, x, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(getFirstIndex(a, x));
        sc.close();
    }
}
