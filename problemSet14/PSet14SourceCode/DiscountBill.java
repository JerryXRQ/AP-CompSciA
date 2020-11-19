/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 4, 2018
 *  Last updated: Mar 4, 2018
 *
 *  Compilation:  javac DiscountBill.java
 *  Execution:    java DiscountBill
 *
 ******************************************************************************/

import java.util.*;

public class DiscountBill extends GroceryBill
{
    // instance variables
    private boolean preferred;
    
    // constructors
    public DiscountBill(boolean p)
    {
        super();
        preferred = p;
    }
    
    // accessor methods
    public int getDiscountCount()
    {
        int result=0;
        if(preferred)
        {
            for (Product item : super.getBasket())
            {
                if(item.getDiscount()!=0)
                {
                    result+=1;
                }
            }
            return result;
        }
        else
        {
            return 0;
        }
    }
    
    public double getDiscountAmount()
    {
        double result=0;
        if(preferred)
        {
            for (Product item : super.getBasket())
            {
                if(item.getDiscount()!=0)
                {
                    result+=item.getDiscount()*item.getPrice();
                }
            }
            return result;
        }
        else
        {
            return 0;
        }
        
    }
    
    public double getDiscountPercent()
    {
        double total=0;
        double after=0;
        if(preferred)
        {
            for (Product item : super.getBasket())
            {
                total+=item.getPrice();
                after+=item.getPrice()*item.getDiscount();
            }            
            double result=after/total*100;
            return result;
        }
        else
        {
            return 0;
        }
    }
    
    
    public double getTotal()
    {
        double result=0;
        if(preferred)
        {
            for (Product item : super.getBasket())
            {
                result+=item.getPrice()-item.getPrice()*item.getDiscount();
            }
        }
        else
        {
            for (Product item : super.getBasket())
            {
                result+=item.getPrice();
            }
        }    
        return result;
    }
}