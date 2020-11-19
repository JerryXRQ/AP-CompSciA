/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 13, 2019
 *  Last updated: Feb 13, 2019
 *
 *  Compilation:  javac WordScramblerTest.java
 *  Execution:    java WordScramblerTest
 *
 ******************************************************************************/

public class WordScramblerTest
{
    public static void main(String[] args)
    {
        String[] phrase = {"hello", "world"};
        WordScrambler blend = new WordScrambler(phrase);
        
        String result = blend.recombine("apple", "pear");
        System.out.println(result);
        result = blend.recombine("pear", "apple");
        System.out.println(result);
        
        String[] elements = {"apple", "pear", "this", "cat"};
        String[] outcome = blend.mixedWords(elements);
        System.out.print("[");
        for (String item : outcome)
        {
            System.out.print(item + " ");
        }
        System.out.print("]");
    }
}