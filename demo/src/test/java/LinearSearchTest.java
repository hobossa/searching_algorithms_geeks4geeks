import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testSearch_ok() {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        Assert.assertEquals(6, LinearSearch.search(arr, 110));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        Assert.assertEquals(-1, LinearSearch.search(arr, 175));
    }
}