/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Oct 23, 2018
 *  Last updated: Oct 23, 2018
 *
 *  Compilation:  javac DownPaymentJUnitTest.java
 *  Execution:    java DownPaymentJUnitTest
 *
 *  This program is the JUnit test bench for DownPayment.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DownPaymentJUnitTest
{
    @Test
    public void testOne()
    {
        int expected = 142;
        int actual = DownPayment.savingsDuration(120000, 0.05, 500000, 0.03);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        int expected = 159;
        int actual = DownPayment.savingsDuration(80000, 0.1, 800000, 0.03);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        int expected = 261;
        int actual = DownPayment.savingsDuration(75000, 0.05, 1500000, 0.05);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        int expected = 114;
        int actual = DownPayment.savingsDuration(108145, 0.0315, 287267, 0.067);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        int expected = 334;
        int actual = DownPayment.savingsDuration(134816, 0.098, 6304070, 0.033);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        int expected = 219;
        int actual = DownPayment.savingsDuration(191146, 0.0105, 1134510, 0.087);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        int expected = 131;
        int actual = DownPayment.savingsDuration(588363, 0.058, 3563630, 0.063);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        int expected = 282;
        int actual = DownPayment.savingsDuration(69000, 0.066, 7902030, 0.093);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        int expected = 231;
        int actual = DownPayment.savingsDuration(26675, 0.0492, 470659, 0.0591);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        int expected = 474;
        int actual = DownPayment.savingsDuration(949108, 0.0322, 31262058, 0.0278);
        assertEquals(expected, actual);
    }
}
