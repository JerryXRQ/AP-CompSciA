/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 19, 2018
 *  Last updated: Feb 19, 2018
 *
 *  Compilation:  javac Cake.java
 *  Execution:    java Cake
 *
 ******************************************************************************/

public class Cake extends Confection
{
    public double q;
    public double p;
    public String n;
    public Cake(String n, double quantity, double price)
    {
        super(n);
        q=quantity;
        p=price;
    }
    public double getCost()
    {
        double result=q*p;
        return result;
    }
}