/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac StringFormatterTest.java
 *  Execution:    java StringFormatterTest
 *  
 *  This program produces a formatted string of a specific length.
 *
 ******************************************************************************/

import java.util.*;

public class StringFormatterTest
{
    public static void main(String[] args)
    {
        // Rocks
        int total = 0;
        int gaps = 0;
        int leftovers = 0;
        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("AP");
        rocks.add("Comp");
        rocks.add("Sci");
        rocks.add("Rocks");
        
        System.out.println(rocks);
        total = StringFormatter.totalLetters(rocks);
        System.out.println("Total number of letters in words = " + total);        
        gaps = StringFormatter.basicGapWidth(rocks, 20);
        System.out.println("Number of gaps between words = " + (rocks.size()-1));
        System.out.println("Basic gap width = " + gaps);
        leftovers = StringFormatter.leftoverSpaces(rocks, 20);
        System.out.println("Leftover spaces = " + leftovers);
        System.out.println(StringFormatter.format(rocks, 20));
        
        // Meal
        System.out.println();
        
        ArrayList<String> meal = new ArrayList<String>();
        meal.add("Green");
        meal.add("eggs");
        meal.add("and");
        meal.add("ham");
        
        System.out.println(meal);
        total = StringFormatter.totalLetters(meal);
        System.out.println("Total number of letters in words = " + total);
        gaps = StringFormatter.basicGapWidth(meal, 20);
        System.out.println("Number of gaps between words = " + (meal.size()-1));
        System.out.println("Basic gap width = " + gaps);
        leftovers = StringFormatter.leftoverSpaces(meal, 20);
        System.out.println("Leftover spaces = " + leftovers);
        System.out.println(StringFormatter.format(meal, 20));
        
        // Sport
        System.out.println();
        
        ArrayList<String> sport = new ArrayList<String>();
        sport.add("Beach");
        sport.add("ball");

        System.out.println(sport);
        total = StringFormatter.totalLetters(sport);
        System.out.println("Total number of letters in words = " + total);
        gaps = StringFormatter.basicGapWidth(sport, 20);
        System.out.println("Number of gaps between words = " + (sport.size()-1));
        System.out.println("Basic gap width = " + gaps);
        leftovers = StringFormatter.leftoverSpaces(sport, 20);
        System.out.println("Leftover spaces = " + leftovers);
        System.out.println(StringFormatter.format(sport, 20));
        
        
        
        
    }
}
