/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac ArrayTester.java
 *  Execution:    java ArrayTester
 *  
 *  This program implements mathematical array operations.
 *
 ******************************************************************************/

public class ArrayTester
{
    public static int[] getColumn(int[][] arr2D, int c)
    {
        int length=arr2D.length;
        int[] result=new int[length];
        int counter=0;
        while (counter<length)
        {
            result[counter]=arr2D[counter][c];
            counter++;
        }
        return result;
    }
    
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    {
        boolean exists = false;
        for (int i = 0; i < arr1.length; i++)
        {
            exists = false;
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    exists = true;
                }
            }
            if (exists == false)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean containsDuplicates(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isLatin(int[][] square)
    {
        boolean result=true;
        int dup=0;
        int c1=1;
        int row=square.length;
        int column=square[0].length;
        if(column!=row)
        {
            result= false;
        }
        if(containsDuplicates(square[0])==true)
        {
            result= false;
        }
        while(c1<row)
        {
            if(hasAllValues(square[0],square[c1] )==false)
            {
                result= false;
            }
            c1++;
        }
        int c2=0;
        while(c2<column)
        {
            if(hasAllValues(getColumn(square,c2),square[0])==false)
            {
                result= false;
            }
            c2++;
        }
        return result;
    }
}
