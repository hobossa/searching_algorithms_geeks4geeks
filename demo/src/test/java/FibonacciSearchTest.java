import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSearchTest {
    @Test
    public void testSearch_ok() {
        int [] arr = {2, 3, 4, 10, 40};
        Assert.assertEquals(3, FibonacciSearch.search(arr, 10));
    }

    @Test
    public void testSearch_fail() {
        int [] arr = {2, 3, 4, 10, 40};
        Assert.assertEquals(-1, FibonacciSearch.search(arr, 11));
    }
}