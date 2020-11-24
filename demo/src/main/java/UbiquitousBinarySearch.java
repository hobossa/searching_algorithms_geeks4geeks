public class UbiquitousBinarySearch {

    // Given a sorted array of N distinct elements. Find a key in the array using least number of comparisons.
    public static int search(int[] arr, int k) {
        return innerSearch(arr, k, 0, arr.length);
    }

    // In practice, comparison would be costly operation, it won’t be just primitive type comparison.
    // It is more economical to minimize comparisons as that of theoretical limit.
    // so we use if (>=) {} else {} rather than if (==) {}else if (>) {}else {}
    static int innerSearch(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (lo + hi) / 2;
            if (k >= arr[m]) {
                lo = m;
            } else {
                hi = m;
            }
        }

        if (k == arr[lo]) {
            return lo;
        }

        return -1;
    }


    // Given an array of N distinct integers, find floor value of input 'key;.
    // Say, A = {-1, 2, 3, 5, 6, 8, 9, 10} and key = 7, we should return 6 as outcome.
    public static int floor(int[] arr, int k) {
        if (k < arr[0]) {
            return -1;
        }
        return innerFloor(arr, k, 0, arr.length);
    }

    static int innerFloor(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (hi + lo) / 2;
            if (k >= arr[m]) {
                lo = m;
            } else {
                hi = m;
            }
        }
        return arr[lo];
    }


    // Given a sorted array with possible duplicate elements. Find number of occurrences of input 'key' in log N time.
    public static int count(int[] arr, int k) {
        return 0;
    }

    static int getLoPosition(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (lo + hi) / 2;

        }

        return 0;
    }

    static int getHiPosition(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (lo + hi) / 2;

        }
        return 0;
    }


    // Given a sorted array of distinct elements, and the array is rotated at an unknown position.
    // Find minimum element in the array.
    public static int indexOfMinimumRotatedArray(int[] arr) {
        return 0;
    }

    static int indexOfMinimumRotatedArray(int[] arr, int lo, int hi) {
        if (arr[lo] <= arr[hi]) {
            return lo;  // not rotated
        }
        int m;
        while (hi - lo > 1) {
            m = (hi + lo) / 2;
            if (arr[lo] < arr[m]) {
                lo = m;
            } else {
                hi = m + 1;
            }
        }
        return -1;
    }
}
