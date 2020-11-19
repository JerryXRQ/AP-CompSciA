/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 18, 2018
 *  Last updated: Nov 18, 2018
 *
 *  Compilation:  javac BarCodeJUnitTest.java
 *  Execution:    java BarCodeJUnitTest
 *
 *  This program is the JUnit test bench for BarCode.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BarCodeJUnitTest
{
    @Test
    public void testOne()
    {
        String expected = "VALID";
        String actual = BarCode.validate("10100011010011001001001100011010001101000110101010111001011100101101100100001011100101011100101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "VALID";
        String actual = BarCode.validate("10100011010111101010111100011010001101000110101010110110011101001100110101110010011101101100101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "VALID";
        String actual = BarCode.validate("10101110110001101011000101011110111101001001101010101110010111001100110111010010111001000100101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        String expected = "VALID";
        String actual = BarCode.validate("10101110110011001001001101111010100011011000101010101000010001001001000111010011001101100110101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        String expected = "VALID";
        String actual = BarCode.validate("10100011010010011001001101111010111101010001101010100111010111001001110101110010011101000010101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        String expected = "INVALID";
        String actual = BarCode.validate("10101111010010011010001100011010001011011011101010110110010000101110010100001010000101011100101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        String expected = "INVALID";
        String actual = BarCode.validate("10101111010001011010001101101110111011011000101010101110010000101110100100100010111001000100101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        String expected = "INVALID";
        String actual = BarCode.validate("10100010110110111011110101000110110001011101101010100001010111001110100100001010111001100110101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "INVALID";
        String actual = BarCode.validate("10100100110111101000110100010110100011011011101010111010010000101011100100100010011101110010101");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        String expected = "INVALID";
        String actual = BarCode.validate("10101100010001011011011100011010111101011101101010101110011101001001110111010010111001001000101");
        assertEquals(expected, actual);
    }
}
