/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac PhraseTest.java
 *  Execution:    java PhraseTest
 *  
 *  This program involves analyzing and modifying a string.
 *
 ******************************************************************************/

public class PhraseTest
{
    public static void main(String[] args)
    {
        int result = 0;
        
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1 + "\n");
        
        Phrase phrase2 = new Phrase("A cat ate late.");
        phrase2.replaceNthOccurrence("at", 3, "xx");
        System.out.println(phrase2 + "\n");
        
        Phrase phrase2a = new Phrase("A cat ate late.");
        phrase2a.replaceNthOccurrence("at", 6, "xx");
        System.out.println(phrase2a + "\n");
        
        Phrase phrase3 = new Phrase("A cat ate late.");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        System.out.println(phrase3 + "\n");
        
        Phrase phrase4 = new Phrase("aaaa");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        System.out.println(phrase4 + "\n");
        
        Phrase phrase5 = new Phrase("aaaa");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        System.out.println(phrase5 + "\n");
        
        Phrase phrase6 = new Phrase("aaaa");
        phrase6.replaceNthOccurrence("aa", 3, "bbb");
        System.out.println(phrase6 + "\n");
        
        Phrase phrase7 = new Phrase("A cat ate late.");
        result = phrase7.findLastOccurrence("at");
        System.out.println(result);
        
        result = phrase7.findLastOccurrence("cat");
        System.out.println(result);
        
        result = phrase7.findLastOccurrence("bat");
        System.out.println(result);
    }
}