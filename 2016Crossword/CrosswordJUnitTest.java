/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac CrosswordJUnitTest.java
 *  Execution:    java CrosswordJUnitTest
 *  
 *  This program implements the coloring scheme and numbering pattern on a
 *  crossword puzzle.
 *
 ******************************************************************************/

import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CrosswordJUnitTest
{
    private Crossword game;
    
    @Before
    public void runBeforeEachTest()
    {
        boolean[][] cells = {
        {true, false, false, true, true, true, false, false, false},
        {false, false, false, false, true, false, false, false, false},
        {false, false, false, false, false, false, true, true, true},
        {false, false, true, false, false, false, true, false, false},
        {true, true, true, false, false, false, false, false, false},
        {false, false, false, false, true, false, false, false, false},
        {false, false, false, true, true, true, false, false, true}};
        game = new Crossword(cells);
    }
    
    @After
    public void runAfterEachTest()
    {
        game = null;
    }
    
    @Test
    public void toBeLabeledTestOne()
    {
        String expected = "B   1   2   B   B   B   3   4   5   \n" +
        "6   0   0   7   B   8   0   0   0   \n" +
        "9   0   0   0   10  0   B   B   B   \n" +
        "11  0   B   12  0   0   B   13  14  \n" +
        "B   B   B   15  0   0   16  0   0   \n" +
        "17  18  19  0   B   20  0   0   0   \n" +
        "21  0   0   B   B   B   22  0   B   \n";
        String actual = game.toString();
        assertEquals(expected, actual);
    }
}
