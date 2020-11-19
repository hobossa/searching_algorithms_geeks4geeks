import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StupidSublistSearchTest {
    @Test
    public void testSearch_ok() {
        String first = "def";
        String second = "abcdefg";
        Assert.assertTrue(StupidSublistSearch.findList(first, second));
    }

    @Test
    public void testSearch_fail() {
        String first = "adef";
        String second = "abcdefg";
        Assert.assertFalse(StupidSublistSearch.findList(first, second));
    }
}