/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac StatsTest.java
 *  Execution:    java StatsTest
 *  
 *  This program maintains a database of student test scores.
 *
 ******************************************************************************/

import java.util.*;

public class StatsTest
{
    public static void main(String[] args)
    {
        Stats examResults = new Stats();
        ArrayList<ScoreInfo> outcomes = null;
        
        examResults.record(86);
        outcomes = examResults.displayScores();
        System.out.println(outcomes);
        
        examResults.record(92);
        outcomes = examResults.displayScores();
        System.out.println(outcomes);
        
        examResults.record(75);
        outcomes = examResults.displayScores();
        System.out.println(outcomes);
        
        examResults.record(90);
        outcomes = examResults.displayScores();
        System.out.println(outcomes);
        
        examResults.record(92);
        outcomes = examResults.displayScores();
        System.out.println(outcomes);
        
        Stats testResults = new Stats();
        ArrayList<ScoreInfo> results = null;
        int[] scoreArray = {93, 84, 75, 49, 92, 34, 75, 92, 38};
        
        testResults.recordScores(scoreArray);
        results = testResults.displayScores();
        System.out.println(results);
        
    }
}