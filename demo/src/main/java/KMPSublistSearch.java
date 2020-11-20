public class KMPSublistSearch {
    public static int findList(String pat, String text) {
        return 0;
    }

    // https://blog.csdn.net/dark_cy/article/details/88698736
    static int[] computeLPSArray(String pat) {
        final int n = pat.length();
        final int[] lps = new int[n];
        lps[0] = 0;     // lps[0] is always 0
        for (int i = 1; i < n; i++) {
            if (pat.charAt(i) == pat.charAt(lps[i-1])) {
                lps[i] = lps[i-1] + 1;
            } else {

            }
        }

        return lps;
    }
}
