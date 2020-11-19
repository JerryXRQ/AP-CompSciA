/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 05, 2018
 *  Last updated: Nov 05, 2018
 *
 *  Compilation:  javac CreditCard.java
 *  Execution:    java CreditCard
 *
 *  This program checks the validity of credit card numbers.
 *
 *  Valid credit card:  AMEX
 *                      MASTERCARD
 *                      VISA
 *                      VALID
 *
 *  Invalid credit card: INVALID
 *
 *  Valid test values:
 *  "378282246310005"   AMEX
 *  "371449635398431"   AMEX
 *  "5555555555554444"  MASTERCARD
 *  "5105105105105100"  MASTERCARD
 *  "4111111111111111"  VISA
 *  "4012888888881881"  VISA
 *  "6451962466988955"  VALID
 *
 *  Invalid test values:
 *  "6176292929"        INVALID
 *  "1234567890314"     INVALID
 *
 ******************************************************************************/

public class CreditCard
{
    public static String validate(String digits)
    {
       int length = digits.length();
       int count = 0;
       int sum1 = 0;
       int sum2 = 0;
       int sum=0;
       String result="";
       if (length%2==0)
       {
           
           while (count<=length-1)
           {
               int integer1=(Integer.parseInt(digits.substring(count,count+1)))*2;
               sum2+=Integer.parseInt(digits.substring(count+1,count+2));
               if (integer1>=10)
               {
                   sum1+=1+integer1%10;
               }
               else 
               {
                   sum2+=integer1;
               }
               count+=2;
           }
           sum= sum1+sum2;
       }
       if(length%2!=0)
       {
           while (count<=length-3)
           {
               sum1+=Integer.parseInt(digits.substring(count,count+1));
               int integer2=(Integer.parseInt(digits.substring(count+1,count+2)))*2;
               if (integer2>=10)
               {
                   sum2+=1+integer2%10;
               }
               else 
               {
                   sum2+=integer2;
               }
               count+=2;
           }
           sum=sum1+sum2+Integer.parseInt(digits.substring(length-1,length));
       }
       if (sum%10==0)
       {
           int start=Integer.parseInt(digits.substring(0,2));
           if(start==37)
           {
               result="AMEX";
           }
           else if(start==34)
           {
               result="AMEX";
           }
           else if(start==51)
           {
               result="MASTERCARD";
           }
           else if(start==52)
           {
               result="MASTERCARD";
           }
           else if(start==53)
           {
               result="MASTERCARD";
           }
           else if(start==54)
           {
               result="MASTERCARD";
           }
           else if(start==55)
           {
               result="MASTERCARD";
           }
           else if ((length==16||length==13)&&(digits.substring(0,1).equals("4")))
           {
               result="VISA";
           }
           else
           {
               result="VALID";
           }

       }
       if (sum%10!=0)
       {
           result="INVALID";
       }
       return result;
    }    
    
    public static void main(String[] args)
    {
        String result = validate("378282246310005");
        System.out.println(result);
    }
}