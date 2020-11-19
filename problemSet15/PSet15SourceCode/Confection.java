/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 21, 2018
 *  Last updated: Feb 21, 2018
 *
 *  Compilation:  javac Confection.java
 *  Execution:    java Confection
 *
 ******************************************************************************/


public abstract class Confection
{
    // instance variables
    private String name;
    
    // constructors
    public Confection(String n)
    {
        name = n;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    // abstract methods
    public abstract double getCost();
}