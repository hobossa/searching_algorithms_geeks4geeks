import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testSearch_ok() {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        Assert.assertEquals(6, LinearSearch.search(arr, 110));
        Assert.assertEquals(0, LinearSearch.search(arr, 10));
        Assert.assertEquals(9, LinearSearch.search(arr, 170));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        Assert.assertEquals(-1, LinearSearch.search(arr, 175));
        Assert.assertEquals(-1, LinearSearch.search(arr, 1));
        Assert.assertEquals(-1, LinearSearch.search(arr, 35));
    }
}