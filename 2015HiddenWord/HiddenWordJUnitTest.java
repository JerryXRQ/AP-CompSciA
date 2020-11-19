/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac HiddenWordJUnitTest.java
 *  Execution:    java HiddenWordJUnitTest
 *  
 *  This program implements a word guessing game.
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HiddenWordJUnitTest
{
    private HiddenWord puzzle;
    private HiddenWord secret;
    
    @Before
    public void runBeforeEachTest()
    {
        puzzle = new HiddenWord("HARPS");
        secret = new HiddenWord("BUCKET");
    }
    
    @After
    public void runAfterEachTest()
    {
        puzzle = null;
        secret = null;
    }
    
    @Test
    public void getHintTestOne()
    {
        String expected = "+A+++";
        String actual = puzzle.getHint("AAAAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestTwo()
    {
        String expected = "H****";
        String actual = puzzle.getHint("HELLO");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestThree()
    {
        String expected = "H*++*";
        String actual = puzzle.getHint("HEART");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestFour()
    {
        String expected = "HAR*S";
        String actual = puzzle.getHint("HARMS");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestFive()
    {
        String expected = "HARPS";
        String actual = puzzle.getHint("HARPS");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestSix()
    {
        String expected = "++++E+";
        String actual = secret.getHint("EEEEEE");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestSeven()
    {
        String expected = "***KE*";
        String actual = secret.getHint("MONKEY");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestEight()
    {
        String expected = "*U*KE*";
        String actual = secret.getHint("SUNKEN");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestNine()
    {
        String expected = "**CKET";
        String actual = secret.getHint("ROCKET");
        assertEquals(expected, actual);
    }
    
    @Test
    public void getHintTestTen()
    {
        String expected = "BUCKET";
        String actual = secret.getHint("BUCKET");
        assertEquals(expected, actual);
    }
}
