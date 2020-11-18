public class JumpSearch {
    public static int search(int[] arr, int v) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int i;
        for (i = 0; i < n; i += step) {
            if (arr[i] > v) {
                break;
            }
        }

        i -= step;
        if (i >= 0) {
            for (int j = i; j < i + step; j++) {
                if (v == arr[j]) {
                    return j;
                }
            }
        }

        return -1;
    }
}
