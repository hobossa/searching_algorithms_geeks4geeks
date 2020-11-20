import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KMPSublistSearchTest {
    @Test
    public void testSearch_ok() {
        String first = "cde";
        String second = "abcdefg";
        Assert.assertEquals(2, KMPSublistSearch.findList(first, second));
    }

    @Test
    public void testSearch_fail() {
        String first = "adef";
        String second = "abcdefg";
        Assert.assertEquals(-1, KMPSublistSearch.findList(first, second));
    }
}