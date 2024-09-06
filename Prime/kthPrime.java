import java.util.*;

public class kthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 86028121;   //5 * 10^6
//        boolean[] sieve = new boolean[n + 1];
//        createSieve(sieve, n);

//        List<Integer> list = new ArrayList<>();
//        for (int i = 2; i <= n; i++) {
//            if (sieve[i]) list.add(i);
//        }

        int[] sieve = countInSieve();

        int t = sc.nextInt();
        while (t-- > 0) {
//          int k = sc.nextInt();
//          System.out.println(list.get(k - 1));
            int n = sc.nextInt();
            System.out.println(sieve[n]);
        }

    }

    // O(n log(log n))
    public static void createSieve(boolean[] sieve, int n) {
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    // O(n log(log n))
    // count how many no.s in the range (1 - 10^6) have minimum prime factors as n //
    public static int[] countInSieve() {
        int n = 1000000;
        int[] sieve = new int[n + 1];

        Arrays.fill(sieve, 1);
        sieve[0] = sieve[1] = 0;

        for (int i = 2; i * i <= n; i++) {
            if (sieve[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    if (sieve[j] != 0) {
                        sieve[i]++;
                        sieve[j] = 0;
                    }

                }
            }
        }

        return sieve;
    }
}
