/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 14, 2019
 *  Last updated: Apr 14, 2019
 *
 *  Compilation:  javac Thoroughbred.java
 *  Execution:    java Thoroughbred
 *  
 *  This program simulates a horse barn that contains a series of stalls.
 *
 ******************************************************************************/

public class Thoroughbred implements Horse
{
    // instance variables
    private String name;
    private int weight;

    // constructors
    public Thoroughbred(String tName, int tWeight)
    {
        name = tName;
        weight = tWeight;
    }

    // accessor methods
    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }
}
