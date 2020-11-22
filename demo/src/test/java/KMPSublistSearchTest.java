import org.cef.callback.CefStringVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Collections;
import java.util.Vector;

import static org.junit.Assert.*;

public class KMPSublistSearchTest {
    @Test
    public void testSearch_ok() {
        Assert.assertEquals(2, KMPSublistSearch.findList("cde", "abcdefg"));
    }

    @Test
    public void testSearchEx_ok() {
        Vector<Integer> re = new Vector<>();
        re.add(0);
        re.add(3);
        Assert.assertEquals(re, KMPSublistSearch.findListEx("ab", "abcab"));
    }

    @Test
    public void testSearch_fail() {
        String pat = "adef";
        String text = "abcdefg";
        Assert.assertEquals(-1, KMPSublistSearch.findList(pat, text));
    }

    @Test
    public void testComputerPrefixArray_ok() {
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, KMPSublistSearch.computePrefixArray("aaaa"));
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, KMPSublistSearch.computePrefixArray("abcd"));
        Assert.assertArrayEquals(new int[]{0, 1, 0, 1, 2, 0, 1, 2, 3, 4, 5}, KMPSublistSearch.computePrefixArray("AABAACAABAA"));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 0, 1, 2, 3, 3, 3, 4}, KMPSublistSearch.computePrefixArray("AAACAAAAAC"));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 0, 1, 2, 3}, KMPSublistSearch.computePrefixArray("AAABAAA"));
    }
}