import java.util.Scanner;

public class AllIndex {
    private static int[] getFirstIndex(int input[], int x, int startIndex) {

        // if startindex reaches the end return empty array.
        if (startIndex > input.length - 1) {
            int[] res = new int[0];
            return res;
        }

        int[] smallAns = getFirstIndex(input, x, startIndex + 1);

        // if the number is found at startIndex
        if (input[startIndex] == x) {
            int[] res = new int[smallAns.length + 1];

            // shift elements to accomodate the starting index
            res[0] = startIndex;

            for (int i = 0; i < smallAns.length; i++) {
                res[i + 1] = smallAns[i];
            }
            return res;

        } else {
            return smallAns;
        }
    }

    public static int[] getFirstIndex(int input[], int x) {
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
        int[] result = getFirstIndex(a, x);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
