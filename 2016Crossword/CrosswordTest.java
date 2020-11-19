/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac CrosswordTest.java
 *  Execution:    java CrosswordTest
 *  
 *  This program implements the coloring scheme and numbering pattern on a
 *  crossword puzzle.
 *
 ******************************************************************************/

public class CrosswordTest
{
    public static void main(String[] args)
    {
        boolean[][] cells = {
        {true, false, false, true, true, true, false, false, false},
        {false, false, false, false, true, false, false, false, false},
        {false, false, false, false, false, false, true, true, true},
        {false, false, true, false, false, false, true, false, false},
        {true, true, true, false, false, false, false, false, false},
        {false, false, false, false, true, false, false, false, false},
        {false, false, false, true, true, true, false, false, true}};
        
        Crossword game = new Crossword(cells);
        System.out.println(game);
    }
}