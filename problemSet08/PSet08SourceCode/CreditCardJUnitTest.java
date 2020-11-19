/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 04, 2018
 *  Last updated: Nov 04, 2018
 *
 *  Compilation:  javac CreditCardJUnitTest.java
 *  Execution:    java CreditCardJUnitTest
 *
 *  This program is the JUnit test bench for CreditCard.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CreditCardJUnitTest
{
    @Test
    public void testOne()
    {
        String expected = "AMEX";
        String actual = CreditCard.validate("348605027629226");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "AMEX";
        String actual = CreditCard.validate("378282246310005");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "MASTERCARD";
        String actual = CreditCard.validate("5105105105105100");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        String expected = "MASTERCARD";
        String actual = CreditCard.validate("5334699717990134");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        String expected = "MASTERCARD";
        String actual = CreditCard.validate("5555555555554444");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        String expected = "VISA";
        String actual = CreditCard.validate("4111111111111111");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        String expected = "VISA";
        String actual = CreditCard.validate("4012888888881881");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        String expected = "VALID";
        String actual = CreditCard.validate("6451962466988955");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "INVALID";
        String actual = CreditCard.validate("6176292929");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        String expected = "INVALID";
        String actual = CreditCard.validate("1234567890314");
        assertEquals(expected, actual);
    }
}
