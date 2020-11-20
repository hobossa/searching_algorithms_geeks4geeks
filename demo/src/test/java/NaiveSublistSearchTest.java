import org.junit.Assert;
import org.junit.Test;

public class NaiveSublistSearchTest {
    @Test
    public void testSearch_ok() {
        String text = "abcdefg";
        Assert.assertEquals(2, NaiveSublistSearch.findList("cde", text));
        Assert.assertEquals(0, NaiveSublistSearch.findList("abc", text));
        Assert.assertEquals(4, NaiveSublistSearch.findList("efg", text));
    }

    @Test
    public void testSearch_fail() {
        String pat = "adef";
        String text = "abcdefg";
        Assert.assertEquals(-1, NaiveSublistSearch.findList(pat, text));
    }

    @Test
    public void testComputerLPS_ok(){
        String pat = "aaaa";
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, KMPSublistSearch.computeLPSArray(pat));
    }
}