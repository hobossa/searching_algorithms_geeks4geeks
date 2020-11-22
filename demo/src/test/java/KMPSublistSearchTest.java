import org.cef.callback.CefStringVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.AsynchronousServerSocketChannel;

import static org.junit.Assert.*;

public class KMPSublistSearchTest {
    @Test
    public void testSearch_ok() {
        String pat = "cde";
        String text = "abcdefg";
        Assert.assertEquals(2, KMPSublistSearch.findList(pat, text));
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