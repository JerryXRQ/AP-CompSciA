/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac Crossword.java
 *  Execution:    java Crossword
 *  
 *  This program implements the coloring scheme and numbering pattern on a
 *  crossword puzzle.
 *
 ******************************************************************************/

public class Crossword
{
    // instance variables
    private Square[][] puzzle;
    
    // constructors
    public Crossword(boolean[][] blackSquares)
    {
        int r=blackSquares.length;
        int c=blackSquares[0].length;
        puzzle=new Square[r][c];
        int counter=1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                boolean det=toBeLabeled(i,j,blackSquares);
                if(det)
                {
                    Square ele=new Square(false,counter);
                    puzzle[i][j]=ele;
                    counter++;
                }
                else if(blackSquares[i][j])
                {
                    Square ele=new Square(true,0);
                    puzzle[i][j]=ele;
                }
                else
                {
                    Square ele=new Square(false,0);
                    puzzle[i][j]=ele;
                }
            }
        }        
    }
    
    public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        boolean result=true;
        if(blackSquares[r][c])
        {
            result=false;
        }
        if(r==0&&c==0)
        {
            result=false;
        }
        if(c>0&&r>0&&(!blackSquares[r-1][c]&&!blackSquares[r][c-1]))
        {
            result=false;
        }
        return result;
    }
    
    public String toString()
    {
        String result = "";
        for (int row = 0; row < puzzle.length; row++)
        {
            for (int col = 0; col < puzzle[0].length; col++)
            {
                result += puzzle[row][col].toString() + "  ";
                if (puzzle[row][col].getNumber() < 10)
                    result += " ";
            }
            result += "\n";
        }
        return result;
    }
}
