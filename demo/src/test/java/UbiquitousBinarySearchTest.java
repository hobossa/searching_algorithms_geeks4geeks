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
        Assert.assertEquals(4, UbiquitousBinarySearch.search(arr, 16));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 1));
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 35));
        Assert.assertEquals(-1, UbiquitousBinarySearch.search(arr, 455));
    }

    @Test
    public void testFloor_ok() {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 10};
        Assert.assertEquals(6, UbiquitousBinarySearch.floor(arr, 7));
        Assert.assertEquals(10, UbiquitousBinarySearch.floor(arr, 13));
        Assert.assertEquals(1, UbiquitousBinarySearch.floor(arr, 1));
    }

    @Test
    public void testFloor_fail() {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 10};
        Assert.assertEquals(-1, UbiquitousBinarySearch.floor(arr, 0));
    }
}