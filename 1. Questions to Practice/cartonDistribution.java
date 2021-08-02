import java.util.*;

public class cartonDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] temp = new int[m];
        int min = Integer.MAX_VALUE;
        Arrays.sort(a);
        for (int i = 0; i <= n - m; i++) {
            for (int j = i, k = 0; k < m; j++, k++) {
                temp[k] = a[j];
            }
            min = Math.min(min, temp[temp.length - 1] - temp[0]);
        }
        System.out.print(min);
        sc.close();
    }
}
