/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Apr 04, 2019
 *  Last updated: Apr 04, 2019
 *
 *  Compilation:  javac Sound.java
 *  Execution:    java Sound
 *  
 *  This program alters the amplitude of a sound wave.
 *
 ******************************************************************************/

public class Sound
{
    private int[] samples;

    public Sound(int[] clips)
    {
        samples = clips;
    }

    public int limitAmplitude(int limit)
    {
        int len=samples.length;
        int[] list=new int[len];
        int counter=0;
        int result=0;
        while(counter<len)
        {
            int ele=samples[counter];
            if(ele<=limit&&ele>=-limit)
            {
                list[counter]=ele;
            }
            else if(ele<-limit)
            {
                list[counter]=-limit;
                result++;
            }
            else
            {
                list[counter]=limit;
                result++;
            }
            counter++;
        }
        samples=list;
        return result;
    }

    public void trimSilenceFromBeginning()
    {
        int len=samples.length;
        int counter=0;
        int counter2=0;
        boolean det=true;
        while(counter<len&&det)
        {
            int ele=samples[counter];
            if(ele!=0)
            {
                det=false;
            }
            counter++;
        }
        int[] list=new int[len-counter+1];
        while(counter<=len)
        {
            list[counter2]=samples[counter-1];
            counter++;
            counter2++;
        }
        samples=list;
    }
    
    public int[] getSamples()
    {
        return samples;
    }
    
    public String toString()
    {
        String result = "";
        for (int item : samples)
        {
            result += item + " ";
        }
        return result;
    }
}
