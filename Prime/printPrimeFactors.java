import java.util.*;

public class printPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000000;   //10^6
        int[] spf = new int[N + 1];     //smallest prime factor
        createSieve(spf, N);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            // O(Log n)
            while (n != 1) {
                System.out.print(spf[n] + " ");
                n = n / spf[n];
            }
            System.out.println();
        }

    }

    // O(n log(log n))
    private static void createSieve(int[] spf, int n) {
        for (int i = 1; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
    }
}
