/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Dec 07, 2018
 *  Last updated: Dec 07, 2018
 *
 *  Compilation:  javac APLine.java
 *  Execution:    java APLine
 *
 *  This program defines the equation of a straight line.
 *
 ******************************************************************************/

public class APLine
{
    private int a;
    private int b;
    private int c;
    public APLine(int mya, int myb, int myc)
    {
        a=mya;
        b=myb;
        c=myc;
    }
    public double getSlope()
    {
        double result = -1.0*a/b;
        return result;
    }
    public boolean isOnLine(int x,int y)
    {
        int result = a*x+b*y+c;
        if (result==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}