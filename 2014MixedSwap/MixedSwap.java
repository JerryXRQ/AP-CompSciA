/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 17, 2019
 *  Last updated: Feb 17, 2019
 *
 *  Compilation:  javac MixedSwap.java
 *  Execution:    java MixedSwap
 *  
 *  This program scrambles a word according to a set of rules.
 *
 ******************************************************************************/

import java.util.*;

public class MixedSwap
{
    public static String scrambleWord(String word)
    {
        int counter=0;
        int end =word.length()-1;
        String result="";
        while(counter<=end)
        {
            String sub=word.substring(counter,counter+1);
            
            if (sub.equals("A")&&(counter<=word.length()-2))
            {
                String sub2=word.substring(counter+1,counter+2);
                
                if(sub2.equals("A"))
                {
                    result+=word.substring(counter,counter+1);
                    counter+=1;
                }
                else
                {
                    result+=word.substring(counter+1,counter+2);
                    result+=word.substring(counter,counter+1);
                    counter+=2;
                }
            }
            else
            {
                result+=word.substring(counter,counter+1);
                counter+=1;
            }
        }
        return result;
    }

    public static void scrambleOrRemove(List<String> wordList)
    {
        int counter=0;
        while(counter<wordList.size())
        {
            String changed=scrambleWord(wordList.get(counter));
            if(changed.equals(wordList.get(counter)))
            {
                wordList.remove(counter);
            }
            else
            {
                wordList.remove(counter);
                wordList.add(counter,changed);
                counter++;
            }
        }  
    }
}
