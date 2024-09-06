import java.util.*;

public class test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int a[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//        for(int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
        rotate(a);
    }

    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
//                swap(matrix[i][j],matrix[j][i]);
            }
        }

        for(int i = 0; i < matrix.length/2; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][matrix.length - i - 1];
                matrix[j][matrix.length - i - 1] = temp;
//               swap(matrix[i][j],matrix[j][i]);
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}