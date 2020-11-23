import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UbiquitousBinarySearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(5, UbiquitousBinarySearch.search(arr, 23));
        Assert.assertEquals(0, UbiquitousBinarySearch.search(arr, 2));
        Assert.assertEquals(9, UbiquitousBinarySearch.search(arr, 91));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 1));
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 35));
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 455));
    }
}