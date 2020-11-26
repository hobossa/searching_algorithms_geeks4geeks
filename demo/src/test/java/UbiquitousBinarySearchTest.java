import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UbiquitousBinarySearchTest {
    @Test
    public void testSearch_ok() {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 100};
        Assert.assertEquals(5, UbiquitousBinarySearch.search(arr, 23));
        Assert.assertEquals(0, UbiquitousBinarySearch.search(arr, 2));
        Assert.assertEquals(9, UbiquitousBinarySearch.search(arr, 91));
        Assert.assertEquals(4, UbiquitousBinarySearch.search(arr, 16));
        Assert.assertEquals(10, UbiquitousBinarySearch.search(arr, 100));
    }


    @Test
    public void testSearch_fail() {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
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

    @Test
    public void testCount_ok() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8};
        Assert.assertEquals(0, UbiquitousBinarySearch.count(arr, 0));
        Assert.assertEquals(0, UbiquitousBinarySearch.count(arr, 9));
        Assert.assertEquals(1, UbiquitousBinarySearch.count(arr, 1));
        Assert.assertEquals(2, UbiquitousBinarySearch.count(arr, 2));
        Assert.assertEquals(3, UbiquitousBinarySearch.count(arr, 3));
        Assert.assertEquals(4, UbiquitousBinarySearch.count(arr, 4));
        Assert.assertEquals(5, UbiquitousBinarySearch.count(arr, 5));
        Assert.assertEquals(6, UbiquitousBinarySearch.count(arr, 6));
        Assert.assertEquals(7, UbiquitousBinarySearch.count(arr, 7));
    }

    @Test
    public void testGetLoPosition_ok() {
        int[] arr1 = {2, 4, 6, 8};
        //Assert.assertEquals(0, UbiquitousBinarySearch.getLoPosition(arr1, -1, 0, arr1.length));
        //Assert.assertEquals(0, UbiquitousBinarySearch.getLoPosition(arr1, 2, 0, arr1.length));
        Assert.assertEquals(1, UbiquitousBinarySearch.getLoPosition(arr1, 4, 0, arr1.length));
    }


    @Test
    public void testIndexOfMinimumRotatedArray_ok() {
        Assert.assertEquals(0, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        Assert.assertEquals(1, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{8, 1, 2, 3, 4, 5, 6, 7}));
        Assert.assertEquals(2, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{7, 8, 1, 2, 3, 4, 5, 6}));
        Assert.assertEquals(3, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{6, 7, 8, 1, 2, 3, 4, 5}));
        Assert.assertEquals(4, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{5, 6, 7, 8, 1, 2, 3, 4}));
        Assert.assertEquals(5, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{4, 5, 6, 7, 8, 1, 2, 3}));
        Assert.assertEquals(6, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{3, 4, 5, 6, 7, 8, 1, 2}));
        Assert.assertEquals(7, UbiquitousBinarySearch.indexOfMinimumRotatedArray(new int[]{2, 3, 4, 5, 6, 7, 8, 1}));
    }
}