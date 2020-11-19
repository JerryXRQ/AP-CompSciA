/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 21, 2018
 *  Last updated: Feb 21, 2018
 *
 *  Compilation:  javac CheckoutTest.java
 *  Execution:    java CheckoutTest
 *
 ******************************************************************************/

public class CheckoutTest
{
    public static void main(String[] args)
    {
        Checkout register = new Checkout();
        
        Cake forest = new Cake("Black Forest", 2.25, 14.92);
        Cookie oatmeal = new Cookie("Oatmeal Raisin", 4, 10.87);
        
        register.purchase(forest);
        register.purchase(oatmeal);
        
        System.out.println("Number of items: " + register.numberOfItems());
        System.out.println("Total cost: " + register.totalCost());
        System.out.println("Total tax: " + register.totalTax());
        System.out.println("Cost + tax: " + (register.totalCost() + register.totalTax()));
        System.out.println(register);
        
        register.clear();
        
        Cake marble = new Cake("Marble", 1.33, 12.89); 
        Cookie chocolatechip = new Cookie("Chocolate Chip", 3, 9.32);
        Cake carrot = new Cake("Carrot", 1.5, 19.71);
        Cake cream = new Cake("Cream", 2.24, 13.94);
        
        register.purchase(marble);
        register.purchase(chocolatechip);
        register.purchase(carrot);
        register.purchase(cream);
        
        System.out.println("Number of items: " + register.numberOfItems());
        System.out.println("Total cost: " + register.totalCost());
        System.out.println("Total tax: " + register.totalTax());
        System.out.println("Cost + tax: " + (register.totalCost() + register.totalTax()));
        System.out.println(register);
        
    }
}