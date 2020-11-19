/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 20, 2018
 *  Last updated: Feb 20, 2018
 *
 *  Compilation:  javac Product.java
 *  Execution:    java Product
 *
 ******************************************************************************/

public class Product
{
    // instance variables
    private double price;
    private double discount;
    
    // constructors
    public Product(double p, double d)
    {
        price = p;
        discount = d;
    }
    
    // accessor methods
    public double getPrice()
    {
        return price;
    }
    
    public double getDiscount()
    {
        return discount;
    }
}