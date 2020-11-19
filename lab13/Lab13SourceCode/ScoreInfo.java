/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac ScoreInfo.java
 *  Execution:    java ScoreInfo
 *  
 *  This program maintains a database of student test scores.
 *
 ******************************************************************************/

import java.util.*;

public class ScoreInfo
{
    private int score;
    private int numStudents;
    
    public ScoreInfo(int aScore)
    {
        score = aScore;
        numStudents = 1;
    }
    
    public void increment()
    {
        numStudents++;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public int getFrequency()
    {
        return numStudents;
    }
    
    public String toString()
    {
        String result = "";
        result += "(" + score + ", ";
        result += numStudents + ")";
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ScoreInfo))
        {
            return false;
        }
        ScoreInfo tally = (ScoreInfo) obj;
        return score == tally.score && numStudents == tally.numStudents;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(score, numStudents);
    }
}
