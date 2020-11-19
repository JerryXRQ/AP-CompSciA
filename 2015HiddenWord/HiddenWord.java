/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac HiddenWord.java
 *  Execution:    java HiddenWord
 *  
 *  This program implements a word guessing game.
 *
 ******************************************************************************/

public class HiddenWord
{
    private String word;
    
    public HiddenWord(String w)
    {
        word = w;
    }
    
    public String getHint(String hint)
    {
        String result="";
        int len=hint.length();
        int counter=0;
        int len2=word.length();
        while(counter<=len-1)
        {
            String sub=hint.substring(counter,counter+1);
            String sub3=word.substring(counter,counter+1);
            int counter2=0;
            if(sub.equals(sub3))
            {
                result+=sub;
            }
            else
            {
                boolean r=false;
                while (counter2<len2)
                {
                    String sub2=word.substring(counter2,counter2+1);
                    if (sub2.equals(sub))
                    {
                        r=true;
                    }
                    counter2++;
                }
                if (r)
                {
                    result+="+";
                }
                else
                {
                    result+="*";
                }
            }
            counter++;
        }       
        return result;
    }
}
