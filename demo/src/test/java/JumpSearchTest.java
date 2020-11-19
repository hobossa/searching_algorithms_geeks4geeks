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
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        Assert.assertEquals(-1, JumpSearch.search(arr, 175));
        Assert.assertEquals(-1, JumpSearch.search(arr, 1175));
        Assert.assertEquals(-1, JumpSearch.search(arr, -1));
    }
}