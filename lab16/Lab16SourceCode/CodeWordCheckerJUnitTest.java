/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 21, 2019
 *  Last updated: Apr 21, 2019
 *
 *  Compilation:  javac CodeWordCheckerJUnitTest.java
 *  Execution:    java CodeWordCheckerJUnitTest
 *  
 *  This program is the JUnit test bench for CodeWordChecker.java
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CodeWordCheckerJUnitTest
{
    private StringChecker cipher;
    private StringChecker crypto;
    private StringChecker encode;
    
    @Before
    public void runBeforeEachTest()
    {
        cipher = new CodeWordChecker(5, 8, "$");
        crypto = new CodeWordChecker("pass");
        encode = new CodeWordChecker(15, 30, "cheeseburger");
    }
    
    @After
    public void runAfterEachTest()
    {
        cipher = null;
        crypto = null;
        encode = null;
    }
    
    @Test
    public void isValidTestOne()
    {
        boolean actual = cipher.isValid("happy");
        assertTrue(actual);
    }
    
    @Test
    public void isValidTestTwo()
    {
        boolean actual = cipher.isValid("happy$");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestThree()
    {
        boolean actual = cipher.isValid("Code");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestFour()
    {
        boolean actual = cipher.isValid("happyCode");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestFive()
    {
        boolean actual = crypto.isValid("MyPass");
        assertTrue(actual);
    }
    
    @Test
    public void isValidTestSix()
    {
        boolean actual = crypto.isValid("Mypassport");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestSeven()
    {
        boolean actual = crypto.isValid("happy");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestEight()
    {
        boolean actual = crypto.isValid("1,000,000,000,000,000");
        assertFalse(actual);
    }
    
    @Test
    public void isValidTestNine()
    {
        boolean actual = encode.isValid("SodaPizzaHamburgerCake");
        assertTrue(actual);
    }
    
    @Test
    public void isValidTestTen()
    {
        boolean actual = encode.isValid("soupsaladcheeseburgericecream");
        assertFalse(actual);
    }
}
