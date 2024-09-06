import java.util.*;

public class AllocateMinPages {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};   // not necessarily sorted
        //n: no. of books, m: no. of students, arr[i]: no. of pages individual book
        System.out.println(findPages(arr.length, arr, 2));
    }

    public static long findPages(int n, int[] arr, int m) {
        // number of books is less than number of students
        if (n < m) {
            return -1;
        }
        int res = -1;
        int start = 0;
        int end = 0;
        for (int i : arr) {
            start = Math.max(start, i); // start = maximum element in array
            end += i;   // end = sum of all elements
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, m, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static boolean isValid(int[] arr, int k, int max) {
        int student = 1;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum > max) {
                student++;
                sum = i;
            }
            if (student > k) {
                return false;
            }
        }
        return true;
    }
}
