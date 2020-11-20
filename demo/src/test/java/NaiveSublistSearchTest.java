import org.junit.Assert;
import org.junit.Test;

public class NaiveSublistSearchTest {
    @Test
    public void testSearch_ok() {
        String first = "cde";
        String second = "abcdefg";
        Assert.assertEquals(2, NaiveSublistSearch.findList(first, second));
    }

    @Test
    public void testSearch_fail() {
        String first = "adef";
        String second = "abcdefg";
        Assert.assertEquals(-1, NaiveSublistSearch.findList(first, second));
    }
}