/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac MountainJUnitTest.java
 *  Execution:    java MountainJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MountainJUnitTest
{
    @Test
    public void getPeakIndexTestOne()
    {
        int[] arr1 = {11, 22, 33, 22, 11};
        int expected = 2;
        int actual = Mountain.getPeakIndex(arr1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void getPeakIndexTestTwo()
    {
        int[] arr2 = {11, 22, 11, 22, 11};
        int expected = 1;
        int actual = Mountain.getPeakIndex(arr2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void getPeakIndexTestThree()
    {
        int[] arr3 = {11, 22, 33, 55, 77};
        int expected = -1;
        int actual = Mountain.getPeakIndex(arr3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void getPeakIndexTestFour()
    {
        int[] arr4 = {99, 33, 55, 77, 120};
        int expected = -1;
        int actual = Mountain.getPeakIndex(arr4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void getPeakIndexTestFive()
    {
        int[] arr5 = {99, 33, 55, 77, 55};
        int expected = 3;
        int actual = Mountain.getPeakIndex(arr5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void isMountainTestSix()
    {
        int[] arr6 = {1, 2, 3, 2, 1};
        assertTrue(Mountain.isMountain(arr6));
    }
    
    @Test
    public void isMountainTestSeven()
    {
        int[] arr7 = {1, 2, 1, 2, 1};
        assertFalse(Mountain.isMountain(arr7));
    }
    
    @Test
    public void isMountainTestEight()
    {
        int[] arr8 = {1, 2, 3, 1, 5};
        assertFalse(Mountain.isMountain(arr8));
    }
    
    @Test
    public void isMountainTestNine()
    {
        int[] arr9 = {1, 4, 2, 1, 0};
        assertTrue(Mountain.isMountain(arr9));
    }
    
    @Test
    public void isMountainTestTen()
    {
        int[] arr10 = {9, 3, 5, 7, 5};
        assertFalse(Mountain.isMountain(arr10));
    }
}
