/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac MountainTest.java
 *  Execution:    java MountainTest
 *
 ******************************************************************************/

public class MountainTest
{
    public static void main(String[] args)
    {
        int[] arr1 = {11, 22, 33, 22, 11};
        int[] arr2 = {11, 22, 11, 22, 11};
        int[] arr3 = {11, 22, 33, 55, 77};
        int[] arr4 = {99, 33, 55, 77, 120};
        int[] arr5 = {99, 33, 55, 77, 55};
        int[] arr6 = {33, 22, 11};

        System.out.println(Mountain.getPeakIndex(arr1));
        System.out.println(Mountain.getPeakIndex(arr2));
        System.out.println(Mountain.getPeakIndex(arr3));
        System.out.println(Mountain.getPeakIndex(arr4));
        System.out.println(Mountain.getPeakIndex(arr5));
        System.out.println(Mountain.getPeakIndex(arr6));

        int[] arr10 = {1, 2, 3, 2, 1};
        int[] arr11 = {1, 2, 1, 2, 1};
        int[] arr12 = {1, 2, 3, 1, 5};
        int[] arr13 = {1, 4, 2, 1, 0};
        int[] arr14 = {9, 3, 5, 7, 5};
        int[] arr15 = {3, 2, 1};

        System.out.println(Mountain.isMountain(arr10));
        System.out.println(Mountain.isMountain(arr11));
        System.out.println(Mountain.isMountain(arr12));
        System.out.println(Mountain.isMountain(arr13));
        System.out.println(Mountain.isMountain(arr14));
        System.out.println(Mountain.isMountain(arr15));
    }
}