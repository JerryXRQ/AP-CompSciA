/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 1, 2019
 *  Last updated: Mar 1, 2019
 *
 *  Compilation:  javac WordScrambler.java
 *  Execution:    java WordScrambler
 *  
 *  This program combines parts of words together.
 *
 ******************************************************************************/

public class WordScrambler
{
    private String[] scrambledWords;
    
    public WordScrambler(String[] wordArr)
    {
        scrambledWords = mixedWords(wordArr);
    }
    
    public String recombine(String word1, String word2)
    {
        int cut1 = word1.length()/2;
        int cut2 = word2.length()/2;
        String result=word1.substring(0,cut1)+word2.substring(cut2,word2.length());
        return result;
    }
    
    public String[] mixedWords(String[] words)
    {
        int l=words.length;
        String[] result=new String[l];
        int counter=0;
        while (counter<l)
        {
            String w1=words[counter];
            String w2=words[counter+1];
            result[counter]=recombine(w1,w2);
            result[counter+1]=recombine(w2,w1);
            counter+=2;
        }
        return result;
    }
}