public class InterpolationSearch {
    public static int search(int[] arr, int v) {
        return innerSearch(arr, v, 0, arr.length);
    }

    static int innerSearch(int[] arr, int v, int lo, int hi) {
        if (lo >= hi) {
            return -1;
        }
        int n = lo;
        if (arr[hi - 1] != arr[lo]) {
            n = n + (hi - 1 - lo) * (v - arr[lo]) / (arr[hi - 1] - arr[lo]);
        }
        if (v == arr[n]) {
            return n;
        } else if (v < arr[n]) {
            return innerSearch(arr, v, lo, n);
        } else {
            return innerSearch(arr, v, n + 1, hi);
        }
    }
}
