/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 17, 2019
 *  Last updated: Feb 17, 2019
 *
 *  Compilation:  javac MixedSwapJUnitTest.java
 *  Execution:    java MixedSwapJUnitTest
 *  
 *  This program scrambles a word according to a set of rules.
 *
 ******************************************************************************/

import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MixedSwapJUnitTest
{
    private ArrayList<String> wordGroup;

    @After
    public void runAfterEachTest()
    {
        wordGroup = null;
    }
    
    @Test
    public void scrambleWordTestOne()
    {
        String expected = "TNA";
        String actual = MixedSwap.scrambleWord("TAN");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestTwo()
    {
        String expected = "BARCADABARA";
        String actual = MixedSwap.scrambleWord("ABRACADABRA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestThree()
    {
        String expected = "WHOA";
        String actual = MixedSwap.scrambleWord("WHOA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestFour()
    {
        String expected = "ARADVRAK";
        String actual = MixedSwap.scrambleWord("AARDVARK");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestFive()
    {
        String expected = "EGGS";
        String actual = MixedSwap.scrambleWord("EGGS");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestSix()
    {
        String expected = "PRACAHUTE";
        String actual = MixedSwap.scrambleWord("PARACHUTE");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestSeven()
    {
        String expected = "VAIALBALE";
        String actual = MixedSwap.scrambleWord("AVAILABLE");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleWordTestEight()
    {
        String expected = "MRATAHON";
        String actual = MixedSwap.scrambleWord("MARATHON");
        assertEquals(expected, actual);
    }
    
    @Test
    public void scrambleOrRemoveTestNine()
    {
        wordGroup = new ArrayList<String>();
        wordGroup.add("TAN");
        wordGroup.add("ABRACADABRA");
        wordGroup.add("WHOA");
        wordGroup.add("APPLE");
        wordGroup.add("EGGS");
        MixedSwap.scrambleOrRemove(wordGroup);
        String[] expected = {"TNA", "BARCADABARA", "PAPLE"};
        String[] actual = wordGroup.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void scrambleOrRemoveTestTen()
    {
        wordGroup = new ArrayList<String>();
        wordGroup.add("EXERCISE");
        wordGroup.add("FLATWARE");
        wordGroup.add("SPECIES");
        wordGroup.add("ADVANTAGE");
        wordGroup.add("INSPIRE");
        MixedSwap.scrambleOrRemove(wordGroup);
        String[] expected = {"FLTAWRAE", "DAVNATGAE"};
        String[] actual = wordGroup.toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}
