/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 21, 2019
 *  Last updated: Mar 21, 2019
 *
 *  Compilation:  javac StringFormatter.java
 *  Execution:    java StringFormatter
 *  
 *  This program produces a formatted string of a specific length.
 *
 ******************************************************************************/

import java.util.*;

public class StringFormatter
{
    public static int totalLetters(ArrayList<String> wordList)
    {
        int counter=0;
        int result=0;
        while (counter<wordList.size())
        {
            String word= wordList.get(counter);
            result+=word.length();
            counter++;
        }
        return result;
    }
    
    public static int basicGapWidth(ArrayList<String> wordList, int formattedLen)
    {
        int letters=totalLetters(wordList);
        int words=wordList.size()-1;
        int result=(formattedLen-letters)/words;
        return result;
    }
    
    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen)
    {
        int letters = totalLetters(wordList);
        int gapSize = basicGapWidth(wordList, formattedLen);
        int numGaps = wordList.size()-1;
        int spaces = formattedLen - letters;
        return spaces - (numGaps*gapSize);
    }
    
    public static String format(ArrayList<String> wordList, int formattedLen)
    {
        String result="";
        int counter=0;
        int leftover=leftoverSpaces(wordList,formattedLen);
        int gap=basicGapWidth(wordList,formattedLen);
        while (counter<wordList.size()-1)
        {
            String word= wordList.get(counter);
            if (leftover>0)
            {
                result+=word+"X";
                int n=0;
                while(n<gap)
                {
                    result+="X";
                    n++;
                }
                leftover--;
            }
            else
            {
                result+=word;
                int n=0;
                while(n<gap)
                {
                    result+="X";
                    n++;
                }
            }
            counter++;
        }
        result+=wordList.get(wordList.size()-1);
        return result;
    }
}