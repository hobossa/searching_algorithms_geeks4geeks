import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpSearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        Assert.assertEquals(10, JumpSearch.search(arr, 55));
        Assert.assertEquals(0, JumpSearch.search(arr, 0));
        Assert.assertEquals(15, JumpSearch.search(arr, 610));
        Assert.assertEquals(3, BinarySearch.search(arr, 2));
        Assert.assertEquals(4, BinarySearch.search(arr, 3));
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(0, BinarySearch.search(arr2, 0));
        Assert.assertEquals(1, BinarySearch.search(arr2, 1));
        Assert.assertEquals(2, BinarySearch.search(arr2, 2));
        Assert.assertEquals(3, BinarySearch.search(arr2, 3));
        Assert.assertEquals(4, BinarySearch.search(arr2, 4));
        Assert.assertEquals(5, BinarySearch.search(arr2, 5));
        Assert.assertEquals(6, BinarySearch.search(arr2, 6));
        Assert.assertEquals(7, BinarySearch.search(arr2, 7));
        Assert.assertEquals(8, BinarySearch.search(arr2, 8));
        Assert.assertEquals(9, BinarySearch.search(arr2, 9));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        Assert.assertEquals(-1, JumpSearch.search(arr, 175));
        Assert.assertEquals(-1, JumpSearch.search(arr, 1175));
        Assert.assertEquals(-1, JumpSearch.search(arr, -1));
    }
}