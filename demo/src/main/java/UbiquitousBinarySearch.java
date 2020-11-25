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
        int n = arr.length;
        int l = getLoPosition(arr, k, 0, n);
        int h = getHiPosition(arr, k, 0, n);
        if (l < 0 || l >= n || h < 0 || h >= n) {
            return 0;
        }
        if (arr[l] == arr[h] && arr[l] == k) {
            return h-l+1;
        }
        return 0;
    }

    // find the biggest item which is less than k;
    // then check if the next item is equal to k;
    static int getLoPosition(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (lo + hi) / 2;
            if (arr[m] >= k) {
                hi = m;
            } else {
                lo = m;
            }
        }

        return hi; // hi = (lo+1)
    }

    // find the smallest item which is greater than k;
    // then check if the previous item is equal to k;
    static int getHiPosition(int[] arr, int k, int lo, int hi) {
        int m;
        while (hi - lo > 1) {
            m = (lo + hi) / 2;
            if (arr[m] <=k ) {
                lo = m;
            } else {
                hi = m;
            }
        }
        return lo;
    }


    // Given a sorted array of distinct elements, and the array is rotated at an unknown position.
    // Find minimum element in the array.
    public static int indexOfMinimumRotatedArray(int[] arr) {
        return indexOfMinimumRotatedArray(arr, 0, arr.length);
    }

    // Using Binary search to find the smallest piece that the fist element is greater than the last one.
    // This means it has only 2 elements and the first element is bigger than the second.
    // then the index of the second one is what we want.
    // arr[n] > arr[n+1], return n+1;
    static int indexOfMinimumRotatedArray(int[] arr, int lo, int hi) {
        if (arr[lo] <= arr[hi - 1]) {
            return lo;  // not rotated
        }
        int m;
        while (hi - lo > 2) {
            m = (hi + lo) / 2;
            if (arr[lo] < arr[m]) {
                lo = m;
            } else {
                hi = m + 1;
            }
        }
        return lo + 1;
    }


    //// // implementation from geeksforgeeks
//    // Input: Indices Range [l ... r)
//    // Invariant: A[l] <= key and A[r] > key
//    static int GetRightPosition(int A[], int l, int r, int key)
//    {
//        int m;
//
//        while( r - l > 1 )
//        {
//            m = l + (r - l)/2;
//
//            if( A[m] <= key )
//                l = m;
//            else
//                r = m;
//        }
//
//        return l;
//    }
//
//    // Input: Indices Range (l ... r]
//    // Invariant: A[r] >= key and A[l] > key
//    static int GetLeftPosition(int A[], int l, int r, int key)
//    {
//        int m;
//
//        while( r - l > 1 )
//        {
//            m = l + (r - l)/2;
//
//            if( A[m] >= key )
//                r = m;
//            else
//                l = m;
//        }
//
//        return r;
//    }
//
//    public static int CountOccurances(int A[], int key)
//    {
//        int size = A.length;
//        // Observe boundary conditions
//        int left = GetLeftPosition(A, -1, size-1, key);
//        int right = GetRightPosition(A, 0, size, key);
//
//        // What if the element doesn't exists in the array?
//        // The checks helps to trace that element exists
//        return (A[left] == key && key == A[right])?
//                (right - left + 1) : 0;
//    }
}
