public class BinarySearch {
    public static int search(int[] arr, int v) {
        return innerSearch(arr, v, 0, arr.length);
    }

    static int innerSearch(int[] arr, int v, int lo, int hi) {
        if (lo >= hi) {
            return -1;
        }
        int n = (lo + hi) / 2;
        if (v == arr[n]) {
            return n;
        } else if(v < arr[n]) {
            return innerSearch(arr, v, lo, n);
        } else {
            return innerSearch(arr, v, n+1, hi);
        }
    }
}
