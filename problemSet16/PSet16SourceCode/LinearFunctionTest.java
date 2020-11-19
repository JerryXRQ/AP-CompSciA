/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Mar 17, 2018
 *  Last updated: Mar 17, 2018
 *
 *  Compilation:  javac LinearFunctionTest.java
 *  Execution:    java LinearFunctionTest
 *
 ******************************************************************************/

public class LinearFunctionTest
{
    public static void main(String[] args)
    {
        LinearFunction line = new LinearFunction(-3, 2.5);
        System.out.println("Slope = " + line.getSlope());
        System.out.println("y-intercept = " + line.getYintercept());
        System.out.println("x-intercept = " + line.getXintercept());
        System.out.println("y value when x = -4.61: " + line.getYvalue(-4.61));
        System.out.println("x value when y = 5.0: " + line.getXvalue(5.0));
    }
}