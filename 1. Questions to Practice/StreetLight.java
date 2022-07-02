public class StreetLight {
    public static void main(String[] args) {
        int[][] arr = {{5, 10}, {12, 18}};
        System.out.println(coverage(2, arr));
    }

    public static int coverage(int input1, int[][] input2) {
        int sum = 0, diff = 0;

        for (int i = 0; i < input1; i++) {

            sum = sum + (input2[i][1] - input2[i][0]);

            if (i < input1 - 1) {

                if (input2[i][1] > input2[i + 1][0] || (input2[i][1] - input2[i + 1][0]) == -1) {

                    diff = diff + (input2[i][1] - input2[i + 1][0]);

                }

            }

        }
        return (sum - diff);
//        int min = input2[0][0];
//        int max = input2[0][1];
//        for (int i = 0; i < input1 - 1; i++) {
//            min = Math.min(min, input2[i + 1][0]);
//            max = Math.max(max, input2[i + 1][1]);
//        }
//        return (max - min);
    }
}
