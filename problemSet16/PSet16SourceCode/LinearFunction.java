/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Apr 1, 2018
 *  Last updated: Apr 1, 2018
 *
 *  Compilation:  javac LinearFunction.java
 *  Execution:    java LinearFunction
 *
 ******************************************************************************/

public class LinearFunction implements LinearFunctionMethods
{
    // instance variables
    private double m;
    private double b;
    
    // constructors
    public LinearFunction(double slope, double yinter)
    {
        m = slope;
        b = yinter;
    }
    
    // abstract methods overridden
    public double getSlope()
    {
        return m;
    }
    
    public double getYintercept()
    {
        return b;
    }
    
    public double getXintercept()
    {
        double result=-b/m;
        return result;
    }
    
    public double getYvalue(double x)
    {
        double result=x*m+b;
        return result;        
    }
    
    public double getXvalue(double y)
    {
        double result=(y-b)/m;
        return result;
    }
}