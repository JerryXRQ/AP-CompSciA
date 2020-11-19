/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac WordPairList.java
 *  Execution:    java WordPairList
 *  
 *  This program generates pairs of words from an array.
 *
 ******************************************************************************/

import java.util.*;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String[] words)
    {
        allPairs=new ArrayList<WordPair>();
        int len=words.length;
        int counter=0;
        while(counter<len-1)
        {
            int counter2=counter+1;
            String word1=words[counter];
            while(counter2<len)
            {
                String word2=words[counter2];
                WordPair target = new WordPair(word1,word2);
                allPairs.add(target);
                counter2++;
            }
            counter++;
        }
    }
    
    public int numMatches()
    {
        int counter=0;
        for(WordPair x:allPairs)
        {
            if(x.getFirst().equals(x.getSecond()))
            {
                counter++;
            }
        }
        return counter;
    }
    
    public ArrayList<WordPair> getAllPairs()
    {
        return allPairs;
    }
}
