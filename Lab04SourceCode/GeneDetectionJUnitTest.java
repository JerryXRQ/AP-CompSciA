/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Oct 28, 2018
 *  Last updated: Oct 28, 2018
 *
 *  Compilation:  javac GeneDetectionJUnitTest.java
 *  Execution:    java GeneDetectionJUnitTest
 *
 *  This program is the JUnit test bench for BookIdentifier.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GeneDetectionJUnitTest
{
    @Test
    public void testOne()
    {
        String expected = "ATGTAGCTAGCATAA";
        String actual = GeneDetection.findGene("ATATGTAGCTAGCATAATA", "TAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "ATGCATCATCATTAA";
        String actual = GeneDetection.findGene("CATATGCATCATCATTAACATCATCAT", "TAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "ATGTAGTAGTAGTAGTAGTAGTAGTAGTAGTAA";
        String actual = GeneDetection.findGene("GATTACAATGTAGTAGTAGTAGTAGTAGTAGTAGTAGTAAGATTACA", "TAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        String expected = "ATGCATCATCATCATCATCATCATCATCATCATCATCATCATCATCATCATTAA";
        String actual = GeneDetection.findGene("GGGGGGGGATGCATCATCATCATCATCATCATCATCATCATCATCATCATCATCATCATTAAGGGGGGGGGGGGGGGGG", "TAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        String expected = "ATGACAAATCACAATCACAAATATACACAACAATAG";
        String actual = GeneDetection.findGene("TCGCTTGCTCGACGCTCGCTGACGATGACAAATCACAATCACAAATATACACAACAATAGACATATCAATA", "TAG");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        String expected = "ATGCGTGCTCGTCGTCGTCGCTCGCTGCTGCTCGTCGCTTAG";
        String actual = GeneDetection.findGene("ATCTACTATCACCATCATCATAAACTATGCGTGCTCGTCGTCGTCGCTCGCTGCTGCTCGTCGCTTAGATCGATGCATCGATGACATCGAT", "TAG");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        String expected = "ATGTCGCTGCTCGTCGTCGCTCGCTCGCCGGTCTCGCGCGCTTAG";
        String actual = GeneDetection.findGene("ACGAGAGCAGAGCGCCGCAAGACGACGACAGACGATGTCGCTGCTCGTCGTCGCTCGCTCGCCGGTCTCGCGCGCTTAGCGATCGATCGAT", "TAG");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEight()
    {
        String expected = "ATGCGCTTCGCGCGCTCTGCGCGCGCTCTCTCTCGCGCGCTCTCCCGGTGA";
        String actual = GeneDetection.findGene("ACTACTACATAATTCTCTCTAATCTCTCTATATGCGCTTCGCGCGCTCTGCGCGCGCTCTCTCTCGCGCGCTCTCCCGGTGAATATCGCGCA", "TGA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "ATGCGCTCGGCTCGCGCCGGCGCTCTCGCGCTCGCTTGA";
        String actual = GeneDetection.findGene("ACGCGCGCGCGAGAGACGAGCAGCAGCATGCGCTCGGCTCGCGCCGGCGCTCTCGCGCTCGCTTGAACTCGGCATATCGCGATATAT", "TGA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTen()
    {
        String expected = "ATGTTCGCTCCTGCGCTCTCTCTCGCGCGCGCTCTCGTCGTCTGA";
        String actual = GeneDetection.findGene("ATCATACATATCTCTCCTATATACTATGTTCGCTCCTGCGCTCTCTCTCGCGCGCGCTCTCGTCGTCTGAATCAGCTAGCATCGATCGAATC", "TGA");
        assertEquals(expected, actual);
    }
}
