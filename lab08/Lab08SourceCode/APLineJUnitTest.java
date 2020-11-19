/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 01, 2018
 *  Last updated: Dec 01, 2018
 *
 *  Compilation:  javac APLineJUnitTest.java
 *  Execution:    java APLineJUnitTest
 *
 *  This program is the JUnit test bench for APLine.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class APLineJUnitTest
{
    private APLine edge;
    
    @Before
    public void runBeforeEachTest()
    {
        edge = new APLine(0, 0, 0);
    }
    
    @After
    public void runAfterEachTest()
    {
        edge = null;
    }

    @Test
    public void testOne()
    {
        edge = new APLine(5, 4, -17);
        double expected = -1.25;
        double actual = edge.getSlope();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testTwo()
    {
        edge = new APLine(5, 4, -17);
        boolean actual = edge.isOnLine(5, -2);
        assertTrue(actual);
    }
    
    @Test
    public void testThree()
    {
        edge = new APLine(-25, 40, 30);
        double expected = 0.625;
        double actual = edge.getSlope();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testFour()
    {
        edge = new APLine(-25, 40, 30);
        boolean actual = edge.isOnLine(5, -2);
        assertFalse(actual);
    }
    
    @Test
    public void testFive()
    {
        edge = new APLine(16, -20, 32);
        double expected = 0.8;
        double actual = edge.getSlope();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testSix()
    {
        edge = new APLine(16, -20, 32);
        boolean actual = edge.isOnLine(-14, 19);
        assertFalse(actual);
    }
    
    @Test
    public void testSeven()
    {
        edge = new APLine(9, -26, -8);
        double expected = 0.346;
        double actual = edge.getSlope();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testEight()
    {
        edge = new APLine(9, -26, -8);
        boolean actual = edge.isOnLine(-12, 11);
        assertFalse(actual);
    }
    
    @Test
    public void testNine()
    {
        edge = new APLine(35, -48, -34);
        double expected = 0.729;
        double actual = edge.getSlope();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testTen()
    {
        edge = new APLine(35, -48, -34);
        boolean actual = edge.isOnLine(-3, 6);
        assertFalse(actual);
    }
}