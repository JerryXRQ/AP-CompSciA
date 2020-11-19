/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Oct 09, 2018
 *  Last updated: Oct 09, 2018
 *
 *  Compilation:  javac QuarterbackJUnitTest.java
 *  Execution:    java QuarterbackJUnitTest
 *
 *  This program is the JUnit test bench for Quarterback.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuarterbackJUnitTest
{
    @Test
    public void testCaseOne()
    {
        double expected = 99.107;
        double actual = Quarterback.quarterbackRating(35, 26, 235, 2, 1);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseTwo()
    {
        double expected = 176.9570707070707;
        double actual = Quarterback.quarterbackRating(33, 26, 465, 5, 0);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseThree()
    {
        double expected = 108.534;
        double actual = Quarterback.quarterbackRating(62, 40, 464, 4, 0);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseFour()
    {
        double expected = 92.385;
        double actual = Quarterback.quarterbackRating(58, 35, 437, 4, 2);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseFive()
    {
        double expected = 117.250;
        double actual = Quarterback.quarterbackRating(50, 36, 422, 3, 0);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseSix()
    {
        double expected = 90.544;
        double actual = Quarterback.quarterbackRating(26, 19, 172, 0, 0);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseSeven()
    {
        double expected = 74.019;
        double actual = Quarterback.quarterbackRating(34, 17, 167, 1, 0);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseEight()
    {
        double expected = 36.300;
        double actual = Quarterback.quarterbackRating(33, 16, 151, 0, 2);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseNine()
    {
        double expected = 73.958;
        double actual = Quarterback.quarterbackRating(20, 16, 145, 1, 2);
        assertEquals(expected, actual, 2);
    }
    
    @Test
    public void testCaseTen()
    {
        double expected = 49.768;
        double actual = Quarterback.quarterbackRating(18, 9, 126, 0, 1);
        assertEquals(expected, actual, 2);
    }
}