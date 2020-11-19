/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 19, 2019
 *  Last updated: Mar 19, 2019
 *
 *  Compilation:  javac Checkout.java
 *  Execution:    java Checkout
 *
 ******************************************************************************/

import java.util.*;

public class Checkout
{
    // instance variables
    private ArrayList<Confection> basket;
    
    // constructors
    public Checkout()
    {
        basket = new ArrayList<Confection>();
    }
    
    // accessor methods
    public int numberOfItems()
    {
        int length=basket.size();
        return length;
    }
    
    public double totalCost()
    {
        int counter=0;
        double result=0;
        while(counter<basket.size())
        {
            result+=(basket.get(counter)).getCost();
            counter++;
        }
        return result;
    }
    
    public double totalTax()
    {
        double result=totalCost();
        result=result*0.065;
        return result;
    }
    
    public String toString()
    {
        String result = "";
        for (Confection item : basket)
        {
            result += item.getName() + "\t" + item.getCost() + "\n";
        }
        return result;
    }
    
    // mutator methods
    public void purchase(Confection c)
    {
        basket.add(c);
    }
    
    public void clear()
    {
        basket = new ArrayList<Confection>();
    }
}