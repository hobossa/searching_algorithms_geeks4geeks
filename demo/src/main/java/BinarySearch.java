public class BinarySearch {
    public static int search(int[] arr, int v) {
        return innerSearch(arr, v, 0, arr.length);
    }

    static int innerSearch(int[] arr, int v, int l, int r) {
        if (l >= r) {
            return -1;
        }
        int n = (l + r) / 2;
        if (v == arr[n]) {
            return n;
        } else if(v < arr[n]) {
            return innerSearch(arr, v, l, n);
        } else {
            return innerSearch(arr, v, n+1, r);
        }
    }
}
