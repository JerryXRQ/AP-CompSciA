/******************************************************************************
 *  Author:       YOUR NAME HERE
 *  Created:      Dec 05, 2018
 *  Last updated: Dec 05, 2018
 *
 *  Compilation:  javac Trail.java
 *  Execution:    java Trail
 *
 *  This program determines whether a trail is level or difficult.
 *
 ******************************************************************************/

public class Trail
{
    // instance variables
    private int[] markers;
    
    // constructors
    public Trail(int[] posts)
    {
        markers = posts;
    }
    
    public boolean isLevelTrailSegment(int start, int end)
    {
        int max=0;
        int min=1000;
        int count=start;
        while (count<end)
        {
            int number=markers[count];
            if (number>max)
            {
                max=number;
            }
            if (number<min)
            {
                min=number;
            }
            count++;
        }
        int ele=max-min;
        if (ele<10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isDifficult()
    {
        int count=0;
        int number=0;
        while (count<11)
        {
            int difference=markers[count]-markers[count+1];
            if (difference>=30||difference<=-30)
            {
                number++;
                count++;
            }
            else
            {
                count++;
            }
        }
        if (number>=3)
        {
            return true;
        }
        else
        {
            return false;
        }         
        
    }
}