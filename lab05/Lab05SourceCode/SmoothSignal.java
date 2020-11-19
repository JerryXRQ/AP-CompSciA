/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 06, 2018
 *  Last updated: Nov 06, 2018
 *
 *  Compilation:  javac SmoothSignal.java
 *  Execution:    java SmoothSignal
 *
 *  This program smoothes an audio signal by averaging intensities.
 *
 ******************************************************************************/

import java.util.*;

public class SmoothSignal
{
    public static int[] levelling(int[] audio)
    {
        int size=audio.length;
        int[]smoth =new int[size];
        smoth[0]=(audio[0]+audio[1])/2;
        smoth[size-1]=(audio[size-2]+audio[size-1])/2;
        for (int i=1; i<size-1;i++)
        {
             smoth[i]=(audio[i-1]+audio[i]+audio[i+1])/3;
        }    
        return smoth;
    }
    
    public static void main(String[] args)
    {
        int[] signal = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
        
        // compute the smoothed value for each cell of the array signal
        int[] result = levelling(signal);

        // display the array: result
        System.out.println(Arrays.toString(result));
    }
}