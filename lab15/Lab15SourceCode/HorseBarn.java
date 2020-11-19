/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Apr 18, 2019
 *  Last updated: Apr 18, 2019
 *
 *  Compilation:  javac HorseBarn.java
 *  Execution:    java HorseBarn
 *  
 *  This program simulates a horse barn that contains a series of stalls.
 *
 ******************************************************************************/

public class HorseBarn
{
    // instance variables
    private Horse[] stalls;

    // constructors
    public HorseBarn(Horse[] s)
    {
        stalls = s;
    }

    // accessor methods
    public int findHorseSpace(String name)
    {
        int counter=0;
        int len=stalls.length;
        int result=-1;
        while(counter<len)
        {
            if(stalls[counter]!=null)
            {
                if(name.equals(stalls[counter].getName()))
                {
                    result=counter;
                }
            }
            counter++;
        }
        return result;              
    }
    
    public void consolidate()
    {
        int len=stalls.length;
        Horse [] result=new Horse[len];
        int counter=0;
        int counter2=0;
        while(counter<len)
        {
            if(stalls[counter]!=null)
            {
                result[counter2]=stalls[counter];
                counter2++;
            }
            counter++;
        }
        int i=0;
        for(Horse element:result)
        {
            stalls[i]=result[i];
            i++;
        }
    }
}
