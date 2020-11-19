import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentialSearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(5, ExponentialSearch.search(arr, 23));
        Assert.assertEquals(0, ExponentialSearch.search(arr, 2));
        Assert.assertEquals(9, ExponentialSearch.search(arr, 91));

        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(0, ExponentialSearch.search(arr2, 0));
        Assert.assertEquals(1, ExponentialSearch.search(arr2, 1));
        Assert.assertEquals(2, ExponentialSearch.search(arr2, 2));
        Assert.assertEquals(3, ExponentialSearch.search(arr2, 3));
        Assert.assertEquals(4, ExponentialSearch.search(arr2, 4));
        Assert.assertEquals(5, ExponentialSearch.search(arr2, 5));
        Assert.assertEquals(6, ExponentialSearch.search(arr2, 6));
        Assert.assertEquals(7, ExponentialSearch.search(arr2, 7));
        Assert.assertEquals(8, ExponentialSearch.search(arr2, 8));
        Assert.assertEquals(9, ExponentialSearch.search(arr2, 9));

        int[] arr3 = {2,2,2,2,2,2,2,2,2,2,2,2};
        Assert.assertEquals(0, ExponentialSearch.search(arr3, 2));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {2,5,8,12,16,23,38,56,72,91};
        Assert.assertEquals(-1, ExponentialSearch.search(arr, 35));
        Assert.assertEquals(-1, ExponentialSearch.search(arr, -200));
        Assert.assertEquals(-1, ExponentialSearch.search(arr, 315));
    }
}