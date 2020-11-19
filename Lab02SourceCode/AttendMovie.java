/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Sep 21, 2018
 *  Last updated: Sep 21, 2018
 *
 *  Compilation:  javac AttendMovie.java
 *  Execution:    java AttendMovie
 *
 *  This program determines the user's interest in seeing a particular movie.
 *
 ******************************************************************************/

public class AttendMovie
{
    public static String selectFilm(double price, double rating)
    {
        if (price<5&& rating>=2)
        {
            return "extremely interested";
        }
        else if (price>=12 && rating<5)
        {
            return"completely uninterested";
        }
        
        else if (price>=12 && rating==5)
        {
            return "barely interested";
        }
        else if (price<12 && rating==5)
        {
            return"very interested";         
        }
        else if ((price>=5 && price<=11.99)&&(rating>=2 && rating<=4))
        {
            return "moderately interested";
        }
        else if (rating<2 && price<5)
        {
            return"barely interested";
        }
        else
        {
            return "uninterested";
        }
        
        
    }

    public static void main(String[] args)
    {
        String result = selectFilm(6.50, 3.5);
        System.out.println(result);
    }
}