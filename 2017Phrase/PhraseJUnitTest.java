/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac PhraseJUnitTest.java
 *  Execution:    java PhraseJUnitTest
 *  
 *  This program involves analyzing and modifying a string.
 *
 ******************************************************************************/

import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PhraseJUnitTest
{
    private Phrase words;
    
    @After
    public void runAfterEachTest()
    {
        words = null;
    }
    
    @Test
    public void replaceNthOccurrenceTestOne()
    {
        words = new Phrase("A cat ate late.");
        words.replaceNthOccurrence("at", 1, "rane");
        String expected = "A crane ate late.";
        String actual = words.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void replaceNthOccurrenceTestTwo()
    {
        words = new Phrase("A cat ate late.");
        words.replaceNthOccurrence("at", 6, "xx");
        String expected = "A cat ate late.";
        String actual = words.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void replaceNthOccurrenceTestThree()
    {
        words = new Phrase("A cat ate late.");
        words.replaceNthOccurrence("bat", 2, "xx");
        String expected = "A cat ate late.";
        String actual = words.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void replaceNthOccurrenceTestFour()
    {
        words = new Phrase("aaaa");
        words.replaceNthOccurrence("aa", 1, "xx");
        String expected = "xxaa";
        String actual = words.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void replaceNthOccurrenceTestFive()
    {
        words = new Phrase("aaaa");
        words.replaceNthOccurrence("aa", 2, "bbb");
        String expected = "abbba";
        String actual = words.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void findLastOccurrenceTestSix()
    {
        words = new Phrase("A cat ate late.");
        int expected = 11;
        int actual = words.findLastOccurrence("at");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findLastOccurrenceTestSeven()
    {
        words = new Phrase("A cat ate late.");
        int expected = 2;
        int actual = words.findLastOccurrence("cat");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findLastOccurrenceTestEight()
    {
        words = new Phrase("A cat ate late.");
        int expected = -1;
        int actual = words.findLastOccurrence("bat");
        assertEquals(expected, actual);
    }
}
