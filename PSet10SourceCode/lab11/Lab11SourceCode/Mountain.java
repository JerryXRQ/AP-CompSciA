/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 7, 2019
 *  Last updated: Mar 7, 2019
 *
 *  Compilation:  javac Mountain.java
 *  Execution:    java Mountain
 *  
 *  This program determines if an array satisfies mountain properties.
 *
 ******************************************************************************/

public class Mountain
{
    public static boolean isIncreasing(int[] array, int stop)
    {
        for (int i = 0; i < stop; i++)
        {
            if (array[i] > array[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start)
    {
        for (int i = start; i < array.length-1; i++)
        {
            if (array[i] < array[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array)
    {
        int len=array.length;
        int counter=1;
        int result=0;
        int index=0;
        while(counter<len)
        {
            if(array[counter]>result)
            {
                result=array[counter];
                index=counter;
                counter++;
            }
            else
            {
                counter++;
            }
        }
        if(index==len-1||index==0)
        {
            index=-1;
        }
        return index;
    }

    public static boolean isMountain(int[] array)
    {
        
        int index=getPeakIndex(array);
        if(index==-1)
        {
            return false;
        }
        else
        {
            if(isIncreasing(array, index)&&isDecreasing(array,index))
            {
                return true;
            }
             else
            {
                return false;
             }
        }
    }
}
