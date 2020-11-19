/******************************************************************************
 *  Author:       Jerry Xu Ruiqi
 *  Created:      Sep 14, 2018
 *  Last updated: Sep 14, 2018
 *
 *  Compilation:  javac Easter.java
 *  Execution:    java Easter
 *
 *  This program determines the month and day that Easter falls on.
 *  The user must input the year.
 *
 ******************************************************************************/

public class Easter
{
    public static int[] findEaster(int year)
    {
        // Determine the month and day that Easter occurs,
        // given a particular year.
        // YOUR CODE HERE
        int a =year%19;
        int b =year/100;
        int c =year%100;
        int d =b/4;
        int e =b%4;
        int g =(8*b+13)/25;
        int h=(19 * a + b - d - g + 15)%30;
        int j =c/4;
        int k =c%4;
        int m =(a + 11 * h)/319;
        int r =(2 * e + 2 * j - k - h + m + 32)%7;
        int n = (h - m + r + 90)/25;
        int p =(h - m + r + n + 19)%32;
        int[] date = new int[2];
        date[0] = n;
        date[1] = p;
        return date;
    }
    
    public static void main(String[] args)
    {
        int[] result = findEaster(2001);
        System.out.println("Month: " + result[0] + " Day: " + result[1]);
    }
}
