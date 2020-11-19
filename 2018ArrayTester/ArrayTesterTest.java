/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 18, 2019
 *  Last updated: Feb 18, 2019
 *
 *  Compilation:  javac ArrayTesterTest.java
 *  Execution:    java ArrayTesterTest
 *  
 *  This program implements mathematical array operations.
 *
 ******************************************************************************/

public class ArrayTesterTest
{
    public static String displayArray(int[] arr)
    {
        String result = "[";
        for (int item : arr)
        {
            result += item + ", ";
        }
        result += "]";
        return result;
    }
    
    public static void main(String[] args)
    {
        int[][] arr2D = {   {0, 1, 2},
                            {3, 4, 5},
                            {6, 7, 8},
                            {9, 5, 3} };
        int[] column = ArrayTester.getColumn(arr2D, 1);
        System.out.println(displayArray(column));
        
        int[] first = {1, 2, 3, 4};
        int[] second = {3, 1, 2, 5};
        System.out.println(ArrayTester.hasAllValues(first, second));
        
        int[] singles = {3, 2, 9, 8, 4, 6};
        int[] doubles = {9, 8, 3, 4, 9, 5};
        System.out.println(ArrayTester.containsDuplicates(singles));
        System.out.println(ArrayTester.containsDuplicates(doubles));
        
        
        int[][] latin1 = {  {1, 2, 3},
                            {2, 3, 1},
                            {3, 1, 2} };
        int[][] latin2 = {  {10, 30, 20, 0},
                            {0, 20, 30, 10},
                            {30, 0, 10, 20},
                            {20, 10, 0, 30} };
        int[][] latin3 = {  {1, 2, 1},
                            {2, 1, 1},
                            {1, 1, 2} };
        int[][] latin4 = {  {1, 2, 3},
                            {3, 1, 2},
                            {7, 8, 9} };
        int[][] latin5 = {  {1, 2},
                            {1, 2} };
        System.out.println(ArrayTester.isLatin(latin1));
        System.out.println(ArrayTester.isLatin(latin2));
        System.out.println(ArrayTester.isLatin(latin3));
        System.out.println(ArrayTester.isLatin(latin4));
        System.out.println(ArrayTester.isLatin(latin5));
    }
}
