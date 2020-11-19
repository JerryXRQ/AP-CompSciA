/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 13, 2019
 *  Last updated: Feb 13, 2019
 *
 *  Compilation:  javac WordScramblerJUnitTest.java
 *  Execution:    java WordScramblerJUnitTest
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

public class WordScramblerJUnitTest
{
    private WordScrambler blend;
    
    @Before
    public void runBeforeEachTest()
    {
        String[] phrase = {"hello", "world"};
        blend = new WordScrambler(phrase);
    }
    
    @After
    public void runAfterEachTest()
    {
        blend = null;
    }
    
    @Test
    public void recombineTestOne()
    {
        String expected = "apar";
        String actual = blend.recombine("apple", "pear");
        assertEquals(expected, actual);
    }
    
    @Test
    public void recombineTestTwo()
    {
        String expected = "peple";
        String actual = blend.recombine("pear", "apple");
        assertEquals(expected, actual);
    }
    
    @Test
    public void recombineTestThree()
    {
        String expected = "burzza";
        String actual = blend.recombine("burger", "pizza");
        assertEquals(expected, actual);
    }
    
    @Test
    public void recombineTestFour()
    {
        String expected = "chocwnie";
        String actual = blend.recombine("chocolate", "brownie");
        assertEquals(expected, actual);
    }
    
    @Test
    public void recombineTestFive()
    {
        String expected = "strawshake";
        String actual = blend.recombine("strawberry", "milkshake");
        assertEquals(expected, actual);
    }
    
    @Test
    public void mixedWordsTestSix()
    {
        String[] expected = {"apar", "peple", "that", "cis"};
        String[] elements = {"apple", "pear", "this", "cat"};
        String[] actual = blend.mixedWords(elements);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void mixedWordsTestSeven()
    {
        String[] expected = {"relrant", "fragease", "halmony", "harlway"};
        String[] elements = {"release", "fragrant", "hallway", "harmony"};
        String[] actual = blend.mixedWords(elements);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void mixedWordsTestEight()
    {
        String[] expected = {"brocaction", "transcoli", "quidence", "coincota"};
        String[] elements = {"broccoli", "transaction", "quota", "coincidence"};
        String[] actual = blend.mixedWords(elements);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void mixedWordsTestNine()
    {
        String[] expected = {"charilence", "prevasmatic", "bangram", "diaquet"};
        String[] elements = {"charismatic", "prevalence", "banquet", "diagram"};
        String[] actual = blend.mixedWords(elements);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void mixedWordsTestTen()
    {
        String[] expected = {"flucthesize", "hypotuation", "integovers", "leftrated"};
        String[] elements = {"fluctuation", "hypothesize", "integrated", "leftovers"};
        String[] actual = blend.mixedWords(elements);
        assertArrayEquals(expected, actual);
    }
}
