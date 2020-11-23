import static java.lang.Integer.min;

public class FibonacciSearch {

    public static int search(int[] arr, int k) {
        int n = arr.length;
        if (n > 0) {
            /* Initialize fibonacci numbers */
            int fibMMm2 = 0;   // (m-2)'th Fibonacci No.
            int fibMMm1 = 1;   // (m-1)'th Fibonacci No.
            int fibM = fibMMm2 + fibMMm1;  // m'th Fibonacci

            while (fibM < n) {
                fibMMm2 = fibMMm1;
                fibMMm1 = fibM;
                fibM = fibMMm2 + fibMMm1;
            }

            int offset = -1;

            while (fibM > 1){ // While the array has elements to be inspected:
                int i = min(offset+fibMMm2, n-1);

                if (k > arr[i]) {
                    // 1 fibonacci down
                    fibM = fibMMm1; // the length on the right of i is fibMMm1
                    fibMMm1 = fibMMm2;
                    fibMMm2 = fibM - fibMMm1;
                    offset = i;

                } else if (k < arr[i]) {
                    // 2 fibonacci down
                    fibM = fibMMm2; // the length on the left of i is fibMMm2
                    fibMMm1 = fibMMm1 - fibMMm2;
                    fibMMm2 = fibM - fibMMm1;
                } else { //if (k == arr[fibMMm2]) {
                    return i;
                }
            }

            /* comparing the last element with k */
            if(fibMMm1 == 1 && arr[offset+1] == k)
                return offset+1;
        }
        return -1;
    }
}
