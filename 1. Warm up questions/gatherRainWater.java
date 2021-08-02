import java.util.*;

public class gatherRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int total = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 1; i < n - 1; i++) {
            int maxInLeft = arr[i];
            for (int j = 0; j < i; j++) {
                maxInLeft = Math.max(maxInLeft, arr[j]);
            }

            int maxInRight = arr[i];
            for (int k = i + 1; k < n; k++) {
                maxInRight = Math.max(maxInRight, arr[k]);
            }
            total += Math.min(maxInLeft, maxInRight) - arr[i];
        }
        System.out.println(total);
    }
}