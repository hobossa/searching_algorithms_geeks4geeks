import java.util.Vector;

public class KMPSublistSearch {
    public static int findList(String pat, String text) {
        return findList(0, pat, text);
    }

    public static int findList(int start, String pat, String text) {
        int[] prefixArray = computePrefixArray(pat);
        int n = text.length();
        int m = pat.length();
        int i = start;
        int j = 0;
        while (i <= n - m + j) {
            if (pat.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            } else {
                if (0 == j) {
                    i++;
                } else {
                    j = prefixArray[j - 1];
                }
            }
            if (j == m) {
                return i - m;
            }
        }

        return -1;
    }

    public static Vector<Integer> findListEx(String pat, String text) {
        Vector<Integer> re = new Vector<>();
        int[] prefixArray = computePrefixArray(pat);
        int n = text.length();
        int m = pat.length();
        int i = 0;
        int j = 0;
        while (i <= n - m + j) {
            if (pat.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            } else {
                if (0 == j) {
                    i++;
                } else {
                    j = prefixArray[j - 1];
                }
            }

            if (j == m) {
                re.add(i - m);
                j = prefixArray[j - 1];
            }

        }
        return re;
    }

    // https://github.com/TheAlgorithms/Java/blob/master/Others/KMP.java
    // https://www.bilibili.com/video/BV1M5411j7Xx?from=search&seid=15350960468391590713
    static int[] computePrefixArray(String pat) {
        final int n = pat.length();
        final int[] lps = new int[n];
        lps[0] = 0;     // lps[0] is always 0
        int p = 0;
        for (int i = 1; i < n; i++) {
            while (p > 0 && pat.charAt(i) != pat.charAt(p)) {
                p = lps[p - 1];
            }

            if (pat.charAt(i) == pat.charAt(p)) {
                p++;
            }

            lps[i] = p;
        }

        return lps;
    }


//    static int[] computePrefixFunction(final String P) {
//        final int n = P.length();
//        final int[] pi = new int[n];
//        pi[0] = 0;
//        int q = 0;
//        for (int i = 1; i < n; i++) {
//            while (q > 0 && P.charAt(q) != P.charAt(i)) {
//                q = pi[q - 1];
//            }
//
//            if (P.charAt(q) == P.charAt(i)) {
//                q++;
//            }
//
//            pi[i] = q;
//        }
//        return pi;
//    }
}
