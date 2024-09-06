import java.util.*;

public class CF1294_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.println(result(i));
        }
    }

    public static String result(int n) {
        int a = n, b = n, c = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                a = i;
                break;
            }
        }
        n = n / a;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != a)
                    b = Math.min(b, i);
                if ((n / i) != i && (n / i) != a)
                    b = Math.min(b, (n / i));
            }
        }
        c = n / b;
        if (a != b && b != c && c!=a && c > 1) {
            return "YES\n" + a + " " + b + " " + c;
        } else {
            return "NO";
        }
    }
}