import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(5, BinarySearch.search(arr, 23));
        Assert.assertEquals(0, BinarySearch.search(arr, 2));
        Assert.assertEquals(9, BinarySearch.search(arr, 91));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(-1, BinarySearch.search(arr, 35));
    }
}