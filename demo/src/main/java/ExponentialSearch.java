import static java.lang.Integer.min;

public class ExponentialSearch {
    public static int search(int[] arr, int v) {
        int n = arr.length;
        if (n > 0) {
//            int lo = 0;
//            int range = 1;
//            int hi = min(lo + range, n);
//            while (lo < n) {
//                if (arr[lo] <= v && v<= arr[hi-1]) {
//                    return binarySearch(arr, v, lo, hi);
//                }
//                lo = hi;
//                range *= 2;
//                hi = min(lo+range, n);
//            }
            if (v == arr[0]) {
                return 0;
            }
            int lo = 1;
            while (lo < n && arr[lo] <= v) {
                lo *= 2;
            }
            return binarySearch(arr, v, lo/2, min(lo, n));
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int v, int lo, int hi) {
        if (lo < hi) {
            int n = (lo + hi) / 2;
            if (v == arr[n]) {
                return n;
            }

            if (v < arr[n]) {
                return binarySearch(arr, v, lo, n);
            }

            return binarySearch(arr, v, n + 1, hi);

        }
        return -1;
    }
}
