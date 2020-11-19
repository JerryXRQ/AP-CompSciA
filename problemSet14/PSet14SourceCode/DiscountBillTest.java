/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 20, 2018
 *  Last updated: Feb 20, 2018
 *
 *  Compilation:  javac DiscountBillTest.java
 *  Execution:    java DiscountBillTest
 *
 ******************************************************************************/

public class DiscountBillTest
{
    public static void main(String[] args)
    {
        Product candybar = new Product(8.39, 0.63);
        Product chips = new Product(3.87, 0.94);
        Product soda = new Product(5.23, 0.0);
        Product salsa = new Product(9.44, 0.51);
        Product cookies = new Product(7.92, 0.74);
        Product crackers = new Product(6.48, 0.29);
        
        Product bread = new Product(2.84, 0.82);
        Product juice = new Product(9.73, 0.0);
        Product cheese = new Product(4.38, 0.71);
        Product milk = new Product(3.29, 0.23);
        Product salad = new Product(8.72, 0.89);
        Product tea = new Product(2.83, 0.64);
        
        DiscountBill member = new DiscountBill(true);
        member.purchase(candybar);
        member.purchase(chips);
        member.purchase(soda);
        member.purchase(salsa);
        member.purchase(cookies);
        member.purchase(crackers);
        
        double result = member.getTotal();
        System.out.println("Member's total = " + result);
        int count = member.getDiscountCount();
        System.out.println("Discount count = " + count);
        double amount = member.getDiscountAmount();
        System.out.println("Discount amount = " + amount);
        double percent = member.getDiscountPercent();
        System.out.println("Discount percent = " + percent);
        
        DiscountBill nonmember = new DiscountBill(false);
        nonmember.purchase(bread);
        nonmember.purchase(juice);
        nonmember.purchase(cheese);
        nonmember.purchase(milk);
        nonmember.purchase(salad);
        nonmember.purchase(tea);
        
        result = nonmember.getTotal();
        System.out.println("Nonmember's total = " + result);
        count = nonmember.getDiscountCount();
        System.out.println("Discount count = " + count);
        amount = nonmember.getDiscountAmount();
        System.out.println("Discount amount = " + amount);
        percent = nonmember.getDiscountPercent();
        System.out.println("Discount percent = " + percent);
    }
}