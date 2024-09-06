// Find next alphabetical element greater than key
public class nextLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'h', 'j'};
        char key = 'f';
        System.out.print(findNextLetter(arr,key));
    }

    public static char findNextLetter(char[] a, char key) {
        char res = '#';
        int n = a.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] <= key) {    // key is equal or greater
                s = mid + 1;
            } else {                // key is smaller (a[mid > key)
                res = a[mid];
                e = mid - 1;
            }
        }

        return res;
    }
}
