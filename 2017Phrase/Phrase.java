/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac Phrase.java
 *  Execution:    java Phrase
 *  
 *  This program involves analyzing and modifying a string.
 *
 ******************************************************************************/

public class Phrase
{
    private String currentPhrase;
    
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    
    public int findNthOccurrence(String str, int n)
    {
        int start = 0;
        int location = -1;
        if (currentPhrase.indexOf(str) != -1)
        {
            location = currentPhrase.indexOf(str);
            if (n == 1)
            {
                return location;
            }
            else
            {
                start = location;
                for (int i = 1; i < n; i++)
                {
                    start = currentPhrase.indexOf(str, start+1);
                    if (start != -1)
                    {
                        location = start;
                    }
                    else
                    {
                        location = -1;
                        break;
                    }
                }
            }
        }
        return location;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int len=str.length();
        int counter=0;
        int num=n;
        int end=currentPhrase.length();
        int counter2=0;
        String result="";
        boolean determine=true;
        while(counter<=end-len&&determine)
        {
            String s=currentPhrase.substring(counter,counter+len);
            if(s.equals(str))
            {
                counter2+=1;
                if(counter2==n)
                {
                    result+=repl;
                    counter+=len;
                    determine=false;
                }
                else
                {
                    result+=currentPhrase.substring(counter,counter+1);
                    counter++;
                }
            }
            else
            {
                result+=currentPhrase.substring(counter,counter+1);
                counter++;
            }
        }
        result+=currentPhrase.substring(counter,end);
        currentPhrase=result;
    }
    
    public int findLastOccurrence(String str)
    {
        int len=str.length();
        int counter=currentPhrase.length();
        int result=-1;
        while(counter>=len)
        {
            String find=currentPhrase.substring(counter-len,counter);
            if(find.equals(str))
            {
                result=counter-len;
                counter=-1;
            }
            else
            {
                counter--;
            }
        }
        return result;
    }
    
    public String toString()
    {
        return currentPhrase;
    }
}