/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Oct 09, 2018
 *  Last updated: Oct 09, 2018
 *
 *  Compilation:  javac Quarterback.java
 *  Execution:    java Quarterback
 *
 *  This program determines the passer rating of an NFL quarterback.
 *
 ******************************************************************************/

public class Quarterback
{
    public static double quarterbackRating(int attempts, int comps, int yards, int tdowns, int ints)
    {
     
        double rating = 0.0;
        double a = (1.0*comps/attempts - 0.3)*5;
        double b = (1.0*yards/attempts - 3) * 0.25;
        double c = 20.0*tdowns/attempts;
        double d = 2.375 - (25.0*ints/attempts);
        if (a<2.375 && b<2.375 && c<2.375 && d<2.375)
        {
        rating = ((a + b + c + d) / 6.0) * 100;}
        else
        {
        if (a>2.375)
        {
            a=2.375;
        }
        if (b>2.375)
        {
            b=2.375;
        }
        if (c>2.375)
        {
            c=2.375;
        }
        if (d>2.375)
        {
            d=2.375;
        }
        if (a<0)
        {
            a=0;
        }
        if (b<0)
        {
            b=0;
        }
        if (c<0)
        {
            c=0;
        }
        if (d<0)
        {
            d=0;
        }
        rating = ((a + b + c + d) / 6.0) * 100;
        }
        
        return rating;
    }
        
        
       
        
    
    
    
    public static void main(String[] args)
    {
        double result = quarterbackRating(35, 26, 235, 2, 1);
        System.out.println(result);
    }
}