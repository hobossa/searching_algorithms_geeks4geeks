public class StupidSublistSearch {

    // Returns true if first string is present in second string
    static boolean findList(String first, String second) {
        int m = first.length();
        int n = second.length();
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (first.charAt(j) != second.charAt(i+j)) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }
}
