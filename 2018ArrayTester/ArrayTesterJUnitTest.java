/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac ArrayTesterJUnitTest.java
 *  Execution:    java ArrayTesterJUnitTest
 *  
 *  This program implements mathematical array operations.
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayTesterJUnitTest
{
    private int[][] matrix;
    
    @After
    public void runAfterEachTest()
    {
        matrix = null;
    }
    
    @Test
    public void getColumnTestOne()
    {
        matrix = new int[][]{{0, 1, 2},
                             {3, 4, 5},
                             {6, 7, 8},
                             {9, 5, 3}};
        int[] expected = new int[]{0, 3, 6, 9};
        int[] actual = ArrayTester.getColumn(matrix, 0);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void getColumnTestTwo()
    {
        matrix = new int[][]{{0, 1, 2},
                             {3, 4, 5},
                             {6, 7, 8},
                             {9, 5, 3}};
        int[] expected = new int[]{1, 4, 7, 5};
        int[] actual = ArrayTester.getColumn(matrix, 1);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void getColumnTestThree()
    {
        matrix = new int[][]{{0, 1, 2},
                             {3, 4, 5},
                             {6, 7, 8},
                             {9, 5, 3}};
        int[] expected = new int[]{2, 5, 8, 3};
        int[] actual = ArrayTester.getColumn(matrix, 2);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void getColumnTestFour()
    {
        matrix = new int[][]{{4, 9, 7, 9},
                             {3, 8, 3, 2},
                             {6, 2, 5, 4},
                             {5, 6, 3, 7}};
        int[] expected = new int[]{7, 3, 5, 3};
        int[] actual = ArrayTester.getColumn(matrix, 2);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void getColumnTestFive()
    {
        matrix = new int[][]{{6, 5, 9, 2, 4},
                             {5, 3, 1, 4, 2},
                             {1, 3, 9, 4, 2},
                             {5, 4, 5, 8, 2},
                             {3, 8, 0, 4, 3},
                             {1, 6, 8, 2, 9}};
        int[] expected = new int[]{4, 2, 2, 2, 3, 9};
        int[] actual = ArrayTester.getColumn(matrix, 4);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void isLatinTestSix()
    {
        matrix = new int[][]{{1, 2, 3},
                             {2, 3, 1},
                             {3, 1, 2}};
        assertTrue(ArrayTester.isLatin(matrix));
    }
    
    @Test
    public void isLatinTestSeven()
    {
        matrix = new int[][]{{10, 30, 20, 0},
                             {0, 20, 30, 10},
                             {30, 0, 10, 20},
                             {20, 10, 0, 30}};
        assertTrue(ArrayTester.isLatin(matrix));
    }
    
    @Test
    public void isLatinTestEight()
    {
        matrix = new int[][]{{1, 2, 1},
                             {2, 1, 1},
                             {1, 1, 2}};
        assertFalse(ArrayTester.isLatin(matrix));
    }
    
    @Test
    public void isLatinTestNine()
    {
        matrix = new int[][]{{1, 2, 3},
                             {3, 1, 2},
                             {7, 8, 9}};
        assertFalse(ArrayTester.isLatin(matrix));
    }
    
    @Test
    public void isLatinTestTen()
    {
        matrix = new int[][]{{1, 2},
                             {1, 2}};
        assertFalse(ArrayTester.isLatin(matrix));
    }
}
