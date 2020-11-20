public class NaiveSublistSearch {

    // Returns true if first string is present in second string
    static int findList(String first, String second) {
        int m = first.length();
        int n = second.length();
        for (int i = 0; i < n - m + 1; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (first.charAt(j) != second.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
