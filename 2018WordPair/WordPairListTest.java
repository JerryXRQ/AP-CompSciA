/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac WordPairListTest.java
 *  Execution:    java WordPairListTest
 *  
 *  This program generates pairs of words from an array.
 *
 ******************************************************************************/

public class WordPairListTest
{
    public static void main(String[] args)
    {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println(exampleOne.getAllPairs());
        
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println(exampleTwo.getAllPairs());
        
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.getAllPairs());
        
        String[] fourthWords = {"tea", "tea", "tea", "coffee"};
        WordPairList exampleFour = new WordPairList(fourthWords);
        System.out.println(exampleFour.getAllPairs());
        
        String[] fifthWords = {"kiwi", "kiwi", "kiwi", "orange", "orange"};
        WordPairList exampleFive = new WordPairList(fifthWords);
        System.out.println(exampleFive.getAllPairs());
        
        int result = exampleThree.numMatches();
        System.out.println(result);
    }
}
