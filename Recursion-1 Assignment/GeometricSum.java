import java.util.Scanner;

public class GeometricSum {

    public static double getGeometricSum(int k, int i) {
        if (k <= 0) {
            return 1;
        }
        return getGeometricSum(k - 1, ++i) + 1 / Math.pow(2, i);
    }

    public static double getGeometricSum(int k) {
        return getGeometricSum(k, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(getGeometricSum(k));
        sc.close();
    }
}
