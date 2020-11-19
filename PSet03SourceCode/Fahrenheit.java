/******************************************************************************
 *  Author:       Jerry Xu Ruiqi
 *  Created:      Sep 11, 2018
 *  Last updated: Sep 11, 2018
 *
 *  Compilation:  javac Fahrenheit.java
 *  Execution:    java Fahrenheit
 *
 *  This program converts celsius to fahrenheit.
 *
 ******************************************************************************/

public class Fahrenheit
{
    public static double calculateFahrenheit(double celsius)
    {
        double fahrenheit = 0.0;
        fahrenheit = celsius*9/5+32;
        
        
        return fahrenheit;
    }
    
    public static void main(String[] args)
    {
        double result = calculateFahrenheit(100.0);
        System.out.println(result);
    }
}
