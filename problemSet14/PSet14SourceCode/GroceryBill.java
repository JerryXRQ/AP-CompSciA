/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 20, 2018
 *  Last updated: Feb 20, 2018
 *
 *  Compilation:  javac GroceryBill.java
 *  Execution:    java GroceryBill
 *
 ******************************************************************************/

import java.util.*;

public class GroceryBill
{
    // instance variables
    private ArrayList<Product> basket;
    
    // constructors
    public GroceryBill()
    {
        basket = new ArrayList<Product>();
    }
    
    // accessor methods
    public double getTotal()
    {
        double total = 0.0;
        for (Product item : basket)
        {
            total += item.getPrice();
        }
        return total;
    }
    
    public String createReceipt()
    {
        String result = "";
        for (Product item : basket)
        {
            result += item.getPrice() + "\n";
        }
        return result;
    }
    
    public ArrayList<Product> getBasket()
    {
        return basket;
    }
    
    // mutator methods
    public void purchase(Product p)
    {
        basket.add(p);
    }
}