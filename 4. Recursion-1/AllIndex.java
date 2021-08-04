import java.util.Scanner;

public class AllIndex {
    private static int[] getFirstIndex(int input[], int x, int startIndex, int foundSoFar) {

        if (startIndex == input.length) {
            return new int[foundSoFar];
        }

        if (input[startIndex] == x) {
            int[] res = getFirstIndex(input, x, startIndex + 1, foundSoFar + 1);
            res[foundSoFar] = startIndex;
            return res;
        } else {
            int[] res = getFirstIndex(input, x, startIndex + 1, foundSoFar);
            return res;
        }

    }

    public static int[] getFirstIndex(int input[], int x) {
        return getFirstIndex(input, x, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result = getFirstIndex(a, x);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
