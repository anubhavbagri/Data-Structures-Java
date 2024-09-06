import java.util.Arrays;
// https://leetcode.com/problems/find-right-interval/

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {0, 1}, {3, 4}};
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    private static int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        int minIndx = 0;
        for (int i = 0; i < intervals.length; i++) {
            boolean success = false;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < intervals.length; j++) {
//                if (i != j) {
                if (intervals[i][1] <= intervals[j][0] && min > intervals[j][0]) {
                    success = true;
                    min = intervals[j][0];
                    minIndx = j;
                }
//                }
            }
            if (success) {
                res[i] = minIndx;
            } else {
                res[i] = -1;
            }
        }
        return res;
    }
}
