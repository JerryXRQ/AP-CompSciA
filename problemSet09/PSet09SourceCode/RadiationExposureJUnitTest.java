/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 06, 2018
 *  Last updated: Nov 06, 2018
 *
 *  Compilation:  javac RadiationExposureJUnitTest.java
 *  Execution:    java RadiationExposureJUnitTest
 *
 *  This program is the JUnit test bench for RadiationExposure.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RadiationExposureJUnitTest
{
    @Test
    public void testOne()
    {
        double expected = 39.10318784326239;
        double actual = RadiationExposure.decayCurveArea(0, 5, 1);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testTwo()
    {
        double expected = 22.94241041057671;
        double actual = RadiationExposure.decayCurveArea(5, 11, 1);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testThree()
    {
        double expected = 62.045598253839096;
        double actual = RadiationExposure.decayCurveArea(0, 11, 1);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testFour()
    {
        double expected = 0.4346123561149849;
        double actual = RadiationExposure.decayCurveArea(40, 100, 1.5);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testFive()
    {
        double expected = 19.29646913965563;
        double actual = RadiationExposure.decayCurveArea(5, 10, 0.25);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testSix()
    {
        double expected = 25.612674363349036;
        double actual = RadiationExposure.decayCurveArea(0, 3, 0.5);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testSeven()
    {
        double expected = 6.7998675225953455;
        double actual = RadiationExposure.decayCurveArea(14, 20, 0.5);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testEight()
    {
        double expected = 0.13540603366915924;
        double actual = RadiationExposure.decayCurveArea(48, 72, 0.4);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testNine()
    {
        double expected = 80.71851259336131;
        double actual = RadiationExposure.decayCurveArea(0, 40, 1);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testTen()
    {
        double expected = 78.52805834817873;
        double actual = RadiationExposure.decayCurveArea(0, 60, 0.5);
        assertEquals(expected, actual, 0.01);
    }
}
