/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 19, 2019
 *  Last updated: Mar 19, 2019
 *
 *  Compilation:  javac Cookie.java
 *  Execution:    java Cookie
 *
 ******************************************************************************/

public class Cookie extends Confection
{
    public double q;
    public double p;
    public Cookie(String n, double quantity, double price)
    {
        super(n);
        q=quantity;
        p=price;
    }
    public double getCost()
    {
        double result=p*q/12.0;
        return result;
    }
    
}