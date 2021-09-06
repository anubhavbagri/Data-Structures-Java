
/*
    1
   212
  32123
 4321234
543212345
 */
import java.util.Scanner;
public class pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        int n = sc.nextInt();
        int x = 1;
        for (int j = (n - 1); j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print(" ");
            }
            for (int k = x; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= x; l++) {
                System.out.print(l);
            }
            System.out.println();
            x++;
        }
    }
}
