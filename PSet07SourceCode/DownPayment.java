/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Oct 29, 2018
 *  Last updated: Oct 29, 2018
 *
 *  Compilation:  javac DownPayment.java
 *  Execution:    java DownPayment
 *
 *  This program determines the number of months required for a down payment.
 *
 ******************************************************************************/

public class DownPayment
{
    public static int savingsDuration(double annualSalary, double percentSaved, double totalCost, double payRaise)
    {
        double a=totalCost*0.25;
        double b=annualSalary/12.0;
        double c= 0.0;
        double rate=0.04;
        int month=0;
        
        while (c<a)
        {
            
            if (month%6==0&&month!=0)
            {
                c+=c*rate/12.0;
                b*=(1.0+payRaise);
                c+=b*percentSaved;               
                month+=1;
            }
            else
            {
                c+=c*rate/12.0;
                c+=b*percentSaved;      
                month++;
            }
        }

        return month;
        
      
    }
    
    public static void main(String[] args)
    {
        int result = savingsDuration(120000, 0.05, 500000, 0.03);
        System.out.println(result);
    }
}
