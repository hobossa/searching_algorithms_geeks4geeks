import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 65, 78, 89, 99, 101, 121, 143, 169};
        Assert.assertEquals(3, FibonacciSearch.search(arr, 10));
        Assert.assertEquals(0, FibonacciSearch.search(arr, 2));
        Assert.assertEquals(13, FibonacciSearch.search(arr, 143));
    }

    @Test
    public void testSearch_fail() {
        int[] arr = {2, 3, 4, 10, 40};
        Assert.assertEquals(-1, FibonacciSearch.search(arr, 11));
    }
}