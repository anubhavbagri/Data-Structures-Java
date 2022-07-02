import java.util.*;

public class altTabQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = altTab(N, K, arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static int[] altTab(int input1, int input2, int[] input3) {
        int[] res = new int[input1];
        input2 = input2 % input1;
        if(input2 == 0){
            input2 = input1;
        }
        res[0] = input3[input2 - 1];
        for (int i = 0; i < input2 - 1; i++) {
            res[i + 1] = input3[i];
        }
        for (int i = input2; i < input1; i++) {
            res[i] = input3[i];
        }
        return res;
    }
}
