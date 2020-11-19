/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 06, 2018
 *  Last updated: Dec 06, 2018
 *
 *  Compilation:  javac TrailJUnitTest.java
 *  Execution:    java TrailJUnitTest
 *
 *  This program is the JUnit test bench for Trail.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TrailJUnitTest
{
    private int[] altitudes;
    private Trail route;
    
    @Before
    public void runBeforeEachTest()
    {
        altitudes = new int[] {0, 0, 0, 0};
        route = new Trail(altitudes);
    }
    
    @After
    public void runAfterEachTest()
    {
        altitudes = null;
        route = null;
    }
    
    @Test
    public void testOne()
    {
        altitudes = new int[] {100,150,105,120,90,80,50,75,75,70,80,90,100};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(7, 10);
        assertTrue(actual);
    }
    
    @Test
    public void testTwo()
    {
        altitudes = new int[] {100,150,105,120,90,80,50,75,75,70,80,90,100};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(2, 12);
        assertFalse(actual);
    }
    
    @Test
    public void testThree()
    {
        altitudes = new int[] {100,150,105,120,90,80,50,75,75,70,80,90,100};
        route = new Trail(altitudes);
        boolean actual = route.isDifficult();
        assertTrue(actual);
    }
    
    @Test
    public void testFour()
    {
        altitudes = new int[] {146,135,135,143,88,53,114,96,75,129,58,112,142};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(3, 8);
        assertFalse(actual);
    }
    
    @Test
    public void testFive()
    {
        altitudes = new int[] {146,135,135,143,88,53,114,96,75,129,58,112,142};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(5, 10);
        assertFalse(actual);
    }
    
    @Test
    public void testSix()
    {
        altitudes = new int[] {100,150,105,120,90,80,50,75,75,70,80,90,100};
        route = new Trail(altitudes);
        boolean actual = route.isDifficult();
        assertTrue(actual);
    }
    
    @Test
    public void testSeven()
    {
        altitudes = new int[] {54,51,55,52,55,58,53,57,56,59,50,59,54};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(1, 6);
        assertTrue(actual);
    }
    
    @Test
    public void testEight()
    {
        altitudes = new int[] {54,51,55,52,55,58,53,57,56,59,50,59,54};
        route = new Trail(altitudes);
        boolean actual = route.isLevelTrailSegment(3, 12);
        assertTrue(actual);
    }
    
    @Test
    public void testNine()
    {
        altitudes = new int[] {54,51,55,52,55,58,53,57,56,59,50,59,54};
        route = new Trail(altitudes);
        boolean actual = route.isDifficult();
        assertFalse(actual);
    }
}