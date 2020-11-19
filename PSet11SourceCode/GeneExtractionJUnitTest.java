/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Nov 27, 2018
 *  Last updated: Nov 27, 2018
 *
 *  Compilation:  javac GeneExtractionJUnitTest.java
 *  Execution:    java GeneExtractionJUnitTest
 *
 *  This program is the JUnit test bench for GeneExtraction.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GeneExtractionJUnitTest
{    
    @Test
    public void testOne()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("CGA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("GCACG");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("ATG");
        assertEquals(expected, actual);
    }

    @Test
    public void testFour()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("TAA");
        assertEquals(expected, actual);
    }

    @Test
    public void testFive()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("TAG");
        assertEquals(expected, actual);
    }

    @Test
    public void testSix()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("TGA");
        assertEquals(expected, actual);
    }

    @Test
    public void testSeven()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("ATGATG");
        assertEquals(expected, actual);
    }

    @Test
    public void testEight()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("GCCATGCCG");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNine()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("GCATGCATGCGTATCACTACTGTACATGCACG");
        assertEquals(expected, actual);
    }

    @Test
    public void testTen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("AGCTATGCCGGATCGCGACGATCAGTCATCGAACTGT");
        assertEquals(expected, actual);
    }

    @Test
    public void testEleven()
    {
        String expected = "ATGCTACGTACGTATCGAGTCTCGTAA";
        String actual = GeneExtraction.geneSequence("GTCATGCTACGTACGTATCGAGTCTCGTAACTG");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwelve()
    {
        String expected = "ATGCGTACTGGTACGTACTAG";
        String actual = GeneExtraction.geneSequence("ACATGCGTACTGGTACGTACTAGCATCGATGCACTG");
        assertEquals(expected, actual);
    }

    @Test
    public void testThirteen()
    {
        String expected = "ATGCGTACTGGTACGTACTGCATCTGA";
        String actual = GeneExtraction.geneSequence("ACATGCGTACTGGTACGTACTGCATCTGACACTG");
        assertEquals(expected, actual);
    }

    @Test
    public void testFourteen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("GATATGAAATTAAACTTTTGTCGCTCAATATACTTATTCATATAACAGTT");
        assertEquals(expected, actual);
    }

    @Test
    public void testFifteen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("AATATGTCGTTTACGGAAAAGAAATGTTACTTGAAAAAAAAATAGGGCAA");
        assertEquals(expected, actual);
    }

    @Test
    public void testSixteen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("ATACATGTTCCTTTTATTTTTCAAAATATGCGGTATTTCCAAATGAAAAAA");
        assertEquals(expected, actual);
    }

    @Test
    public void testSeventeen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("CAGCTCGAATGGTGGAACATCAGAGAGTATCAATAAGCCTAACTAATCAT");
        assertEquals(expected, actual);
    }

    @Test
    public void testEighteen()
    {
        String expected = "ATGCTTCTAACTACCCCCCGATATAAGTTTCTTTAA";
        String actual = GeneExtraction.geneSequence("TGTACGATGCTTCTAACTACCCCCCGATATAAGTTTCTTTAACCATAACA");
        assertEquals(expected, actual);
    }

    @Test
    public void testNineteen()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("ATGCTGCGAGAAATATATCGCCTACTAGCGGTGCGTTCTCATAGTTTAGCC");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwenty()
    {
        String expected = "ATGGAAAAGCGCTCCACTATAGAGCGATAG";
        String actual = GeneExtraction.geneSequence("CTAACCAATGGAAAAGCGCTCCACTATAGAGCGATAGAAACTAGACGCCC");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyOne()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("ATAATGTTTCAAATTCGAACGACTAATACCATTGAGCTGATGGTGATACGC");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyTwo()
    {
        String expected = "ATGCCGAAGCTTCTGAAGTCTTGCCTGACTTGA";
        String actual = GeneExtraction.geneSequence("CTCACATGCCGAAGCTTCTGAAGTCTTGCCTGACTTGAAGGTTGAAGAGA");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyThree()
    {
        String expected = "INVALID";
        String actual = GeneExtraction.geneSequence("TGCAATGCACTTGATTGAGTCAGTTAAGATGATTAGCCTCTATCTAAAG");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyFour()
    {
        String expected = "ATGGTCGAACTCATAGACGTAATCTCTGAGCTAAGTTAA";
        String actual = GeneExtraction.geneSequence("CGAATGGTCGAACTCATAGACGTAATCTCTGAGCTAAGTTAATGAGTTAG");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentyFive()
    {
        String expected = "ATGGCCGCGGCTGTAGTTAATACTGAAATTAGTAATAAGTAG";
        String actual = GeneExtraction.geneSequence("GCGGCGCATGGCCGCGGCTGTAGTTAATACTGAAATTAGTAATAAGTAGCG");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwentySix()
    {
        String expected = "ATGTGTTGGCGCTCCAGTGATGATAGTAATGATAGTGATAGTAAGTGA";
        String actual = GeneExtraction.geneSequence("TATGTGTTGGCGCTCCAGTGATGATAGTAATGATAGTGATAGTAAGTGATAG");
        assertEquals(expected, actual);
    }
    
}