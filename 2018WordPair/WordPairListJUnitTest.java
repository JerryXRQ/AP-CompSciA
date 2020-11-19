/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac WordPairListJUnitTest.java
 *  Execution:    java WordPairListJUnitTest
 *  
 *  This program generates pairs of words from an array.
 *
 ******************************************************************************/

import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordPairListJUnitTest
{
    private WordPairList pairs;
    private ArrayList<WordPair> practical;
    
    @Before
    public void runBeforeEachTest()
    {
        
    }
    
    @After
    public void runAfterEachTest()
    {
        pairs = null;
        practical = null;
    }
    
    @Test
    public void constructorTestOne()
    {
        String[] firstWords = {"one", "two", "three"};
        pairs = new WordPairList(firstWords);
        WordPair[] expected = new WordPair[]{new WordPair("one", "two"),
                                             new WordPair("one", "three"),
                                             new WordPair("two", "three")};
        practical = pairs.getAllPairs();
        WordPair[] actual = practical.toArray(new WordPair[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void constructorTestTwo()
    {
        String[] firstWords = {"the", "more", "the", "merrier"};
        pairs = new WordPairList(firstWords);
        WordPair[] expected = new WordPair[]{new WordPair("the", "more"),
                                             new WordPair("the", "the"),
                                             new WordPair("the", "merrier"),
                                             new WordPair("more", "the"),
                                             new WordPair("more", "merrier"),
                                             new WordPair("the", "merrier")};
        practical = pairs.getAllPairs();
        WordPair[] actual = practical.toArray(new WordPair[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void constructorTestThree()
    {
        String[] firstWords = {"the", "red", "fox", "the", "red"};
        pairs = new WordPairList(firstWords);
        WordPair[] expected = new WordPair[]{new WordPair("the", "red"),
                                             new WordPair("the", "fox"),
                                             new WordPair("the", "the"),
                                             new WordPair("the", "red"),
                                             new WordPair("red", "fox"),
                                             new WordPair("red", "the"),
                                             new WordPair("red", "red"),
                                             new WordPair("fox", "the"),
                                             new WordPair("fox", "red"),
                                             new WordPair("the", "red")};
        practical = pairs.getAllPairs();
        WordPair[] actual = practical.toArray(new WordPair[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void constructorTestFour()
    {
        String[] firstWords = {"tea", "tea", "tea", "coffee"};
        pairs = new WordPairList(firstWords);
        WordPair[] expected = new WordPair[]{new WordPair("tea", "tea"),
                                             new WordPair("tea", "tea"),
                                             new WordPair("tea", "coffee"),
                                             new WordPair("tea", "tea"),
                                             new WordPair("tea", "coffee"),
                                             new WordPair("tea", "coffee")};
        practical = pairs.getAllPairs();
        WordPair[] actual = practical.toArray(new WordPair[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void constructorTestFive()
    {
        String[] firstWords = {"kiwi", "kiwi", "kiwi", "orange", "orange"};
        pairs = new WordPairList(firstWords);
        WordPair[] expected = new WordPair[]{new WordPair("kiwi", "kiwi"),
                                             new WordPair("kiwi", "kiwi"),
                                             new WordPair("kiwi", "orange"),
                                            new WordPair("kiwi", "orange"),
                                            new WordPair("kiwi", "kiwi"),
                                            new WordPair("kiwi", "orange"),
                                            new WordPair("kiwi", "orange"),
                                            new WordPair("kiwi", "orange"),
                                            new WordPair("kiwi", "orange"),
                                            new WordPair("orange", "orange")};
        practical = pairs.getAllPairs();
        WordPair[] actual = practical.toArray(new WordPair[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void numMatchesTestSix()
    {
        String[] firstWords = {"one", "two", "three"};
        pairs = new WordPairList(firstWords);
        int expected = 0;
        int actual = pairs.numMatches();
        assertEquals(expected, actual);
    }
    
    @Test
    public void numMatchesTestSeven()
    {
        String[] firstWords = {"the", "more", "the", "merrier"};
        pairs = new WordPairList(firstWords);
        int expected = 1;
        int actual = pairs.numMatches();
        assertEquals(expected, actual);
    }
    
    @Test
    public void numMatchesTestEight()
    {
        String[] firstWords = {"the", "red", "fox", "the", "red"};
        pairs = new WordPairList(firstWords);
        int expected = 2;
        int actual = pairs.numMatches();
        assertEquals(expected, actual);
    }
    
    @Test
    public void numMatchesTestNine()
    {
        String[] firstWords = {"tea", "tea", "tea", "coffee"};
        pairs = new WordPairList(firstWords);
        int expected = 3;
        int actual = pairs.numMatches();
        assertEquals(expected, actual);
    }
    
    @Test
    public void numMatchesTestTen()
    {
        String[] firstWords = {"kiwi", "kiwi", "kiwi", "orange", "orange"};
        pairs = new WordPairList(firstWords);
        int expected = 4;
        int actual = pairs.numMatches();
        assertEquals(expected, actual);
    }
}
