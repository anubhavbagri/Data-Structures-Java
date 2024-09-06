import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {0, -23, 56, 18, -2, -1};
//        selectionSort(arr);
//        bubbleSort(arr);
//        insertionSort(arr);
        int[] a = mergeSort(arr, 0, arr.length - 1);
        System.out.println(-8 >>> 2);
        System.out.println(Arrays.toString(a));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndx] > arr[j])
                    minIndx = j;
            }
            swapArray(arr, minIndx, i);
        }
    }

    static void bubbleSort(int[] arr) {
        // no of passes/round= n-1
        for (int i = 1; i <= arr.length - 1; i++) {
            // for round 1 to n-1
            boolean swapped = false;    //optimizing
            for (int j = 0; j < arr.length - i; j++) {
                //process element till n-i th index

                if (arr[j] > arr[j + 1]) {
                    swapArray(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;  //already swapped
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    // shift
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }



    public static int[] mergeSort(int[] arr, int start, int end) {

        if (start == end) {
            int[] baseArray = new int[1];
            baseArray[0] = arr[start];
            return baseArray;
        }

        int mid = (start + end) / 2;

        int[] firstSortedHalf = mergeSort(arr, start, mid);
        int[] secondSortedHalf = mergeSort(arr, mid + 1, end);

        return mergeTwoSortedArrays(firstSortedHalf, secondSortedHalf);
    }

    public static int[] mergeTwoSortedArrays(int a[], int b[]) {
        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }

        return res;
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
