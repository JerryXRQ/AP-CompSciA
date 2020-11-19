/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 10, 2018
 *  Last updated: Nov 10, 2018
 *
 *  Compilation:  javac CaesarCipherJUnitTest.java
 *  Execution:    java CaesarCipherJUnitTest
 *
 *  This program is the JUnit test bench for CaesarCipher.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CaesarCipherJUnitTest
{
    @Test
    public void testOne()
    {
        String expected = "ifmmp";
        String actual = CaesarCipher.encrypt("hello", 1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "yggv harrs";
        String actual = CaesarCipher.encrypt("good pizza", 18);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "jbbq jb xq kllk";
        String actual = CaesarCipher.encrypt("meet me at noon", 23);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        String expected = "htruqnrjsyfwd hfpj ns ymj htskjwjshj wttr";
        String actual = CaesarCipher.encrypt("complimentary cake in the conference room", 5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        String expected = "aol ilhy pz zapjrf dpao ovulf";
        String actual = CaesarCipher.encrypt("the bear is sticky with honey", 7);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        String expected = "nds ja jiz viy cvga v yjuzi ja ocz joczm";
        String actual = CaesarCipher.encrypt("six of one and half a dozen of the other", 21);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        String expected = "ftdx atr pabex max lng labgxl";
        String actual = CaesarCipher.encrypt("make hay while the sun shines", 19);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        String expected = "m efufot uz fuyq emhqe zuzq";
        String actual = CaesarCipher.encrypt("a stitch in time saves nine", 12);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "whh pdwp cheppano eo jkp ckhz";
        String actual = CaesarCipher.encrypt("all that glitters is not gold", 22);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        String expected = "yzaje ngxj lux grr ul euax kdgsotgzouty";
        String actual = CaesarCipher.encrypt("study hard for all of your examinations", 6);
        assertEquals(expected, actual);
    }
}
