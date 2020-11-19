/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 19, 2018
 *  Last updated: Nov 19, 2018
 *
 *  Compilation:  javac BarCode.java
 *  Execution:    java BarCode
 *
 *  This program checks the validity of UPC-A codes.
 *
 ******************************************************************************/

public class BarCode
{
    public static String validate(String barPattern)
    {
        String[] left = {"0001101", "0011001", "0010011", "0111101", "0100011",
                         "0110001", "0101111", "0111011", "0110111", "0001011"};
        String[] right = {"1110010", "1100110", "1101100", "1000010", "1011100",
                          "1001110", "1010000", "1000100", "1001000", "1110100"};
        String numberlist="";

        for (int leftindex=3;leftindex<=38;leftindex=leftindex+7)
        {
            String s1=barPattern.substring(leftindex,leftindex+7);
            int index=0;
            int result=0;
            while (index<10)
            {
                if (s1.equals(left[index]))
                {
                    result=index;
                    index++;
                }
                else
                {
                    index++;
                }
            }
            numberlist+= Integer.toString(result);
        }
        
        for(int rightindex=50;rightindex<=85;rightindex=rightindex+7)
        {
            String s1=barPattern.substring(rightindex,rightindex+7);
            int index1=0;
            int result1=0;
            while (index1<10)
            {
                if (s1.equals(right[index1]))
                {
                    result1=index1;
                    index1++;
                }
                else
                {
                    index1++;
                }
            }
            numberlist+= Integer.toString(result1);
        }
        int count=0;
        int sum=0;
        while (count<=10)
        {
            int odd= Integer.parseInt(numberlist.substring(count,count+1));
            int even=Integer.parseInt(numberlist.substring(count+1,count+2));
            sum= sum+odd*3+even;
            count=count+2;
        }
        sum=sum-Integer.parseInt(numberlist.substring(11,12));
        int result=10-sum%10;
        String end="";
        if (result==Integer.parseInt(numberlist.substring(11,12)))
        {
            end="VALID";
        }
        else
        {
            end="INVALID";
        }
        return end;
    }
    
    public static void main(String[] args)
    {
        String product = "10100011010011001001001100011010001101000110101010111001011100101101100100001011100101011100101";
        String result = validate(product);
        System.out.println(result);
    }
}