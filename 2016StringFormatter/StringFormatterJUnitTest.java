/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac StringFormatterJUnitTest.java
 *  Execution:    java StringFormatterJUnitTest
 *  
 *  This program produces a formatted string of a specific length.
 *
 ******************************************************************************/

import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringFormatterJUnitTest
{
    private ArrayList<String> rocks;
    private ArrayList<String> meal;
    private ArrayList<String> sport;
    
    @Before
    public void runBeforeEachTest()
    {
        rocks = new ArrayList<String>();
        rocks.add("AP");
        rocks.add("Comp");
        rocks.add("Sci");
        rocks.add("Rocks");
        meal = new ArrayList<String>();
        meal.add("Green");
        meal.add("eggs");
        meal.add("and");
        meal.add("ham");
        sport = new ArrayList<String>();
        sport.add("Beach");
        sport.add("ball");
    }
    
    @After
    public void runAfterEachTest()
    {
        rocks = null;
        meal = null;
        sport = null;
    }
    
    @Test
    public void totalLettersTestOne()
    {
        int expected = 14;
        int actual = StringFormatter.totalLetters(rocks);
        assertEquals(expected, actual);
    }
    
    @Test
    public void basicGapWidthTestTwo()
    {
        int expected = 2;
        int actual = StringFormatter.basicGapWidth(rocks, 20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void formatTestThree()
    {
        String expected = "APXXCompXXSciXXRocks";
        String actual = StringFormatter.format(rocks, 20);
    }
    
    @Test
    public void totalLettersTestFour()
    {
        int expected = 15;
        int actual = StringFormatter.totalLetters(meal);
        assertEquals(expected, actual);
    }
    
    @Test
    public void basicGapWidthTestFive()
    {
        int expected = 1;
        int actual = StringFormatter.basicGapWidth(meal, 20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void formatTestSix()
    {
        String expected = "GreenXXeggsXXandXham";
        String actual = StringFormatter.format(meal, 20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void totalLettersTestSeven()
    {
        int expected = 9;
        int actual = StringFormatter.totalLetters(sport);
        assertEquals(expected, actual);
    }
    
    @Test
    public void basicGapWidthTestEight()
    {
        int expected = 11;
        int actual = StringFormatter.basicGapWidth(sport, 20);
        assertEquals(expected, actual);
    }
    
    @Test
    public void formatTestNine()
    {
        String expected = "BeachXXXXXXXXXXXball";
        String actual = StringFormatter.format(sport, 20);
        assertEquals(expected, actual);
    }
}
