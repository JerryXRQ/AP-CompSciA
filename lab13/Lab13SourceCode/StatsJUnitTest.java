/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac StatsJUnitTest.java
 *  Execution:    java StatsJUnitTest
 *  
 *  This program maintains a database of student test scores.
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class StatsJUnitTest
{
    private Stats examResults;
    private ArrayList<ScoreInfo> practical;
    
    @Before
    public void runBeforeEachTest()
    {
        examResults = new Stats();
        practical = null;
    }
    
    @After
    public void runAfterEachTest()
    {
        examResults = null;
        practical = null;
    }
    
    @Test
    public void recordTestOne()
    {
        assertTrue(examResults.record(86));
    }
    
    @Test
    public void recordTestTwo()
    {        
        ScoreInfo[] expected = new ScoreInfo[1];
        expected[0] = new ScoreInfo(86);
        
        examResults.record(86);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void recordTestThree()
    {
        examResults.record(86);
        assertTrue(examResults.record(92));
    }
    
    @Test
    public void recordTestFour()
    {
        ScoreInfo[] expected = new ScoreInfo[2];
        expected[0] = new ScoreInfo(86);
        expected[1] = new ScoreInfo(92);
        
        examResults.record(86);
        examResults.record(92);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void recordTestFive()
    {
        examResults.record(86);
        examResults.record(92);
        assertTrue(examResults.record(75));
    }
    
    @Test
    public void recordTestSix()
    {
        ScoreInfo[] expected = new ScoreInfo[3];
        expected[0] = new ScoreInfo(75);
        expected[1] = new ScoreInfo(86);
        expected[2] = new ScoreInfo(92);
        
        examResults.record(86);
        examResults.record(92);
        examResults.record(75);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void recordTestSeven()
    {
        examResults.record(86);
        examResults.record(92);
        examResults.record(75);
        assertFalse(examResults.record(92));
    }
    
    @Test
    public void recordTestEight()
    {
        ScoreInfo[] expected = new ScoreInfo[3];
        expected[0] = new ScoreInfo(75);
        expected[1] = new ScoreInfo(86);
        expected[2] = new ScoreInfo(92);
        expected[2].increment();
        
        examResults.record(86);
        examResults.record(92);
        examResults.record(75);
        examResults.record(92);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void recordScoresTestNine()
    {
        ScoreInfo[] expected = new ScoreInfo[7];
        expected[0] = new ScoreInfo(34);
        expected[1] = new ScoreInfo(38);
        expected[2] = new ScoreInfo(49);
        expected[3] = new ScoreInfo(75);
        expected[3].increment();
        expected[4] = new ScoreInfo(84);
        expected[5] = new ScoreInfo(92);
        expected[5].increment();
        expected[6] = new ScoreInfo(93);
        
        int[] scoreArray = {93, 84, 75, 49, 92, 34, 75, 92, 38};
        examResults.recordScores(scoreArray);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void recordScoresTestTen()
    {
        ScoreInfo[] expected = new ScoreInfo[10];
        expected[0] = new ScoreInfo(23);
        expected[1] = new ScoreInfo(29);
        expected[2] = new ScoreInfo(38);
        expected[2].increment();
        expected[3] = new ScoreInfo(49);
        expected[4] = new ScoreInfo(65);
        expected[4].increment();
        expected[4].increment();
        expected[5] = new ScoreInfo(75);
        expected[6] = new ScoreInfo(81);
        expected[6].increment();
        expected[6].increment();
        expected[6].increment();
        expected[7] = new ScoreInfo(83);
        expected[8] = new ScoreInfo(91);
        expected[9] = new ScoreInfo(94);
        
        int[] scoreArray = {29, 81, 65, 81, 49, 38, 65, 75, 23, 81, 94, 81, 83, 65, 91, 38};
        examResults.recordScores(scoreArray);
        practical = examResults.displayScores();
        ScoreInfo[] actual = practical.toArray(new ScoreInfo[0]);
        assertArrayEquals(expected, actual);
    }
}
