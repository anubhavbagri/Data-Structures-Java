import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 7, 9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int partitionIndx = partition(arr, low, high);
            quickSort(arr, low, partitionIndx - 1);
            quickSort(arr, partitionIndx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while(i < j){
            while(arr[i] <= pivot && i <= high) i++;
            while(arr[j] > pivot && j >= low)   j--;
            if(i < j) swapArray(arr, i, j);
        }

        swapArray(arr, low, j);

        return j;
    }

    private static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
