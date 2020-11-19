/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 22, 2018
 *  Last updated: Nov 22, 2018
 *
 *  Compilation:  javac PolybiusCipherJUnitTest.java
 *  Execution:    java PolybiusCipherJUnitTest
 *
 *  This program is the JUnit test bench for PolybiusCipher.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PolybiusCipherJUnitTest
{
    private String[][] key;
    
    @Before
    public void runBeforeEachTest()
    {
        key = new String[][] {{"n", "a", "1", "c", "3", "h"},
                              {"8", "t", "b", "2", "o", "m"},
                              {"e", "5", "w", "r", "p", "d"},
                              {"4", "f", "6", "g", "7", "i"},
                              {"9", "j", "0", "k", "l", "q"},
                              {"s", "u", "v", "x", "y", "z"}};
    }
    
    @After
    public void runAfterEachTest()
    {
        key = null;
    }

    
    @Test
    public void testOne()
    {
        String expected = "buy12cheesepizzas";
        String message = "bcfbfeacbdadafcacafacacedfffffabfa";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "read8bookseverymonth";
        String message = "cdcaabcfbabcbebeedfacafccacdfebfbeaabbaf";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "study3hourseveryevening";
        String message = "fabbfbcffeaeafbefbcdfacafccacdfecafccaaadfaadd";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        String expected = "get9hoursofsleep";
        String message = "ddcabbeaafbefbcdfabedbfaeecacace";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        String expected = "winteriscoming2019";
        String message = "ccdfaabbcacddffaadbebfdfaaddbdecacea";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        String expected = "exercise30minutesperday";
        String message = "cafdcacdaddffacaaeecbfdfaafbbbcafacecacdcfabfe";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        String expected = "eat5servingsofvegetables";
        String message = "caabbbcbfacacdfcdfaaddfabedbfccaddcabbabbceecafa";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        String expected = "run5kilometersin20minutes";
        String message = "cdfbaacbeddfeebebfcabbcacdfadfaabdecbfdfaafbbbcafa";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "donotfeedwildanimals";
        String message = "cfbeaabebbdbcacacfccdfeecfabaadfbfabeefa";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        String expected = "depositcansinrecycling";
        String message = "cfcacebefadfbbadabaafadfaacdcaadfeadeedfaadd";
        String actual = PolybiusCipher.decrypt(message, key);
        assertEquals(expected, actual);
    }
}
