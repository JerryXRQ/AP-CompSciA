/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac WordPair.java
 *  Execution:    java WordPair
 *  
 *  This program generates pairs of words from an array.
 *
 ******************************************************************************/

import java.util.*;

public class WordPair
{
    private String first;
    private String second;
    
    public WordPair(String firstWord, String secondWord)
    {
        first = firstWord;
        second = secondWord;
    }
    
    public String getFirst()
    {
        return first;
    }
    
    public String getSecond()
    {
        return second;
    }
    
    public String toString()
    {
        return "(\"" + first + "\", \"" + second + "\")";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof WordPair))
        {
            return false;
        }
        WordPair couple = (WordPair) obj;
        return first.equals(couple.first) && second.equals(couple.second);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(first, second);
    }
}
