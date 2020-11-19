/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Sep 22, 2017
 *  Last updated: Sep 22, 2017
 *
 *  Compilation:  javac FahrenheitJUnitTest.java
 *  Execution:    java FahrenheitJUnitTest
 *
 *  This program is the JUnit test bench for Fahrenheit.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FahrenheitJUnitTest
{
    @Test
    public void evaluateOne()
    {
        double expected = 212.0;
        double actual = Fahrenheit.calculateFahrenheit(100.0);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void evaluateTwo()
    {
        double expected = 98.6;
        double actual = Fahrenheit.calculateFahrenheit(37.0);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void evaluateThree()
    {
        double expected = 32.0;
        double actual = Fahrenheit.calculateFahrenheit(0.0);
        assertEquals(expected, actual, 0.1);
    }
}
