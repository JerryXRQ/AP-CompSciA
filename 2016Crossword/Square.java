/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac Square.java
 *  Execution:    java Square
 *  
 *  This program implements the coloring scheme and numbering pattern on a
 *  crossword puzzle.
 *
 ******************************************************************************/

public class Square
{
    // instance variables
    private boolean isBlackCell;
    private int number;
    
    public Square(boolean isBlack, int num)
    {
        isBlackCell = isBlack;
        number = num;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public String toString()
    {
        String result = "";
        if (isBlackCell)
        {
            result = "B";
        }
        else
        {
            result = String.valueOf(number);
        }
        return result;
    }
}
