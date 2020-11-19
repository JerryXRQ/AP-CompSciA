/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 12, 2018
 *  Last updated: Nov 12, 2018
 *
 *  Compilation:  javac RadiationExposure.java
 *  Execution:    java RadiationExposure
 *
 *  This program determines the amount of radiation exposure.
 *
 ******************************************************************************/

public class RadiationExposure
{
    // this function describes the radioactive decay curve of Cobalt-60
    public static double f(double x)
    {
        double activity = 10*Math.exp(Math.log(0.5)/5.27 * x);
        return activity;
    }
    
    public static double decayCurveArea(int start, int stop, double step)
    {
        double current=start;
        double amount=0;
        while (current<stop)
        {
            amount+=f(current)*step;
            current+=step;
        }
        return amount;
    }
    
    public static void main(String[] args)
    {
        double result = decayCurveArea(5, 11, 1);
        System.out.println(result);
    }
}