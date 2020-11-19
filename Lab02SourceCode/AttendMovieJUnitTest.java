/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Sep 13, 2018
 *  Last updated: Sep 13, 2018
 *
 *  Compilation:  javac AttendMovieJUnitTest.java
 *  Execution:    java AttendMovieJUnitTest
 *
 *  This program is the JUnit test bench for AttendMovie.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AttendMovieJUnitTest
{
    @Test
    public void testCaseOne()
    {
        String expected = "extremely interested";
        String actual = AttendMovie.selectFilm(3.50, 3.0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseTwo()
    {
        String expected = "barely interested";
        String actual = AttendMovie.selectFilm(15.50, 5.0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseThree()
    {
        String expected = "very interested";
        String actual = AttendMovie.selectFilm(10.50, 5.0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseFour()
    {
        String expected = "moderately interested";
        String actual = AttendMovie.selectFilm(7.50, 2.5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseFive()
    {
        String expected = "barely interested";
        String actual = AttendMovie.selectFilm(2.50, 1.5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseSix()
    {
        String expected = "completely uninterested";
        String actual = AttendMovie.selectFilm(25.50, 0.5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseSeven()
    {
        String expected = "moderately interested";
        String actual = AttendMovie.selectFilm(5.00, 2.0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseEight()
    {
        String expected = "moderately interested";
        String actual = AttendMovie.selectFilm(11.99, 4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseNine()
    {
        String expected = "barely interested";
        String actual = AttendMovie.selectFilm(4.99, 1.9);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCaseTen()
    {
        String expected = "extremely interested";
        String actual = AttendMovie.selectFilm(4.99, 2.0);
        assertEquals(expected, actual);
    }
}