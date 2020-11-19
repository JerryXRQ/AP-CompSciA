/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 17, 2019
 *  Last updated: Feb 17, 2019
 *
 *  Compilation:  javac MixedSwapTest.java
 *  Execution:    java MixedSwapTest
 *  
 *  This program scrambles a word according to a set of rules.
 *
 ******************************************************************************/

import java.util.*;

public class MixedSwapTest
{
    public static void main(String[] args)
    {
        System.out.println(MixedSwap.scrambleWord("TAN"));
        System.out.println(MixedSwap.scrambleWord("ABRACADABRA"));
        System.out.println(MixedSwap.scrambleWord("WHOA"));
        System.out.println(MixedSwap.scrambleWord("AARDVARK"));
        System.out.println(MixedSwap.scrambleWord("EGGS"));
        System.out.println(MixedSwap.scrambleWord("A"));
        System.out.println(MixedSwap.scrambleWord(""));

        List<String> wordGroup = new ArrayList<String>();
        wordGroup.add("TAN");
        wordGroup.add("ABRACADABRA");
        wordGroup.add("WHOA");
        wordGroup.add("APPLE");
        wordGroup.add("EGGS");
        System.out.println(wordGroup);
        MixedSwap.scrambleOrRemove(wordGroup);
        System.out.println(wordGroup);
    }
}