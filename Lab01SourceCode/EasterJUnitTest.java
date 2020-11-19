/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Sep 13, 2018
 *  Last updated: Sep 13, 2018
 *
 *  Compilation:  javac EasterJUnitTest.java
 *  Execution:    java EasterJUnitTest
 *
 *  This program is the JUnit test bench for Easter.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class EasterJUnitTest
{
    @Test
    public void evaluateOne()
    {
        int[] expected = {4, 15};
        int[] actual = Easter.findEaster(2001);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void evaluateTwo()
    {
        int[] expected = {4, 4};
        int[] actual = Easter.findEaster(2010);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void evaluateThree()
    {
        int[] expected = {4, 9};
        int[] actual = Easter.findEaster(1950);
        assertArrayEquals(expected, actual);
    }
}
