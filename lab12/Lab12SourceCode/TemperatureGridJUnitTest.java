/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac TemperatureGridJUnitTest.java
 *  Execution:    java TemperatureGridJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TemperatureGridJUnitTest
{
    private double[][] weather;
    private TemperatureGrid readings;
    private double[][] forecast;
    private TemperatureGrid celsius;
    
    @Before
    public void runBeforeEachTest()
    {
        weather = new double[][]{{95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
                                 {0.0, 50.0, 50.0, 50.0, 50.0, 0.0},
                                 {0.0, 40.0, 40.0, 40.0, 40.0, 0.0},
                                 {0.0, 20.0, 20.0, 20.0, 20.0, 0.0},
                                 {0.0, 0.0, 0.0, 0.0, 0.0, 0.0} };
        readings = new TemperatureGrid(weather);
        forecast = new double[][]{{31.7, 15.7, 92.6, 39.5, 91.3, 93.9},
                                  {43.9, 75.2, 43.0, 98.2, 30.9, 48.7},
                                  {23.0, 49.8, 76.5, 39.4, 80.3, 92.4},
                                  {34.0, 87.5, 94.2, 87.5, 23.4, 98.5},
                                  {94.7, 58.2, 47.5, 20.9, 43.5, 39.8} };
        celsius = new TemperatureGrid(forecast);
    }
    
    @After
    public void runAfterEachTest()
    {
        weather = null;
        readings = null;
    }
    
    @Test
    public void computeTempTestOne()
    {
        double expected = 37.5;
        double actual = readings.computeTemp(2, 3);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void computeTempTestTwo()
    {
        double expected = 47.5;
        double actual = readings.computeTemp(1, 1);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void computeTempTestThree()
    {
        double expected = 100.0;
        double actual = readings.computeTemp(0, 2);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void computeTempTestFour()
    {
        double expected = 60.0;
        double actual = readings.computeTemp(1, 3);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void computeTempTestFive()
    {
        double expected = 15.0;
        double actual = readings.computeTemp(3, 4);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void computeTempTestSix()
    {
        double expected = 47.5;
        double actual = readings.computeTemp(1, 4);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void updateAllTempsTestSeven()
    {
        assertFalse(readings.updateAllTemps(0.01));
    }
    
    @Test
    public void updateAllTempsTestEight()
    {
        double[][] expected = { {95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
                                {0.0, 47.5, 60.0, 60.0, 47.5, 0.0},
                                {0.0, 27.5, 37.5, 37.5, 27.5, 0.0},
                                {0.0, 15.0, 20.0, 20.0, 15.0, 0.0},
                                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0} };
        readings.updateAllTemps(0.01);
        double[][] actual = readings.getTemps();    
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void updateAllTempsTestNine()
    {
        assertTrue(celsius.updateAllTemps(75.0));
    }
    
    @Test
    public void updateAllTempsTestTen()
    {
        double[][] expected = { {31.7, 15.7, 92.6, 39.5, 91.3, 93.9},
                                {43.9, 38.1, 85.625, 38.2, 79.625, 48.7},
                                {23.0, 65.55, 56.6, 85.625, 46.525, 92.4},
                                {34.0, 59.05, 74.75, 44.475, 77.45, 98.5},
                                {94.7, 58.2, 47.5, 20.9, 43.5, 39.8} };
        celsius.updateAllTemps(75.0);
        double[][] actual = celsius.getTemps();    
        assertArrayEquals(expected, actual);
    }
}
