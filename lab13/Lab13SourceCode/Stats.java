/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 29, 2019
 *  Last updated: Mar 29, 2019
 *
 *  Compilation:  javac Stats.java
 *  Execution:    java Stats
 *  
 *  This program maintains a database of student test scores.
 *
 ******************************************************************************/

import java.util.*;

public class Stats
{
    private ArrayList<ScoreInfo> scoreList;
    public Stats()
    {
        scoreList = new ArrayList<ScoreInfo>();
    }
    
    public boolean record(int score)
    {
        boolean result=true;
        int counter=0;
        int end=scoreList.size();
        int point=0;
        if(end==0)
        {
            ScoreInfo newscore=new ScoreInfo(score);
            scoreList.add(0,newscore);
        }
        else
        {
            while(counter<end)
            {
                int grade=scoreList.get(counter).getScore();
                if(score==grade)
                {
                    result=false;
                    scoreList.get(counter).increment();
                }
                counter++;
            }
        
            if (result)
            {
                ScoreInfo newscore=new ScoreInfo(score);
                int counter2=0;
                while(counter2<end)
                {
                    int grade=scoreList.get(counter2).getScore();
                    boolean det=true;
                    if(grade>score&&det)
                    {
                        scoreList.add(counter2,newscore);
                        det=false;
                    }
                    counter2++;
                }  
            }
        }
        return result;
    }
    
    public void recordScores(int[] stuScores)
    {
        for(int score:stuScores)
        {
            record(score);
        }
    }
    
    public ArrayList<ScoreInfo> displayScores()
    {
        return scoreList;
    }
}