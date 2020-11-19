/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Mar 17, 2018
 *  Last updated: Mar 17, 2018
 *
 *  Compilation:  javac LinearFunctionJUnitTest.java
 *  Execution:    java LinearFunctionJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinearFunctionJUnitTest
{
    private LinearFunction line;
    
    @Before
    public void runBeforeEachTest()
    {
        line = new LinearFunction(-3, 2.5);
    }
    
    @After
    public void runAfterEachTest()
    {
        line = null;
    }
    
    @Test
    public void getSlopeTestOne()
    {
        double expected = -3.0;
        double actual = line.getSlope();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getYinterceptTestTwo()
    {
        double expected = 2.5;
        double actual = line.getYintercept();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getXinterceptTestThree()
    {
        double expected = 0.83;
        double actual = line.getXintercept();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getYvalueTestFour()
    {
        double expected = 16.3;
        double actual = line.getYvalue(-4.61);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getXvalueTestFive()
    {
        double expected = -0.83;
        double actual = line.getXvalue(5.0);
        assertEquals(expected, actual, 0.1);
    }
}