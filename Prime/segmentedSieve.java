import java.util.*;

/**
 * test cases t <= 10
 * print all primes in the range l, r
 * 1 <= (l,r) <= 10^12
 * difference r-l <= 10^6
 */

public class segmentedSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000000;   //10^6
        boolean[] sieve = new boolean[N + 1];
        // O(10^6)
        createSieve(sieve, N);

        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            // step 1: generate all primes till sqrt(r)
            // At max r = 10^12 so generating till sqrt will make O(10^6)
            List<Integer> primes = generatePrimes(sieve, (int) Math.sqrt(r));

            // step 2: create a dummy array of size r-l+1 & make everyone as 1
            // Rolling in size r-l : O(10^6)
            int dummy[] = new int[r - l + 1];
            for (int i = 0; i < r - l + 1; i++)
                dummy[i] = 1;

            // step 3: for all prime numbers mark its multiples as false
            // ~ O(10^4)
            for (int pr : primes) {
                int firstMul = (l / pr) * pr;
                if (firstMul < l) firstMul += pr;
                for (int j = Math.max(firstMul, pr * pr); j <= r; j += pr) {
                    dummy[j - l] = 0;
                }
            }

            //step 4: get all the primes
            for (int i = l; i <= r; i++) {
                if (dummy[i - l] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static List generatePrimes(boolean[] sieve, int n) {
        List<Integer> ds = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) ds.add(i);
        }
        return ds;
    }

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
}
