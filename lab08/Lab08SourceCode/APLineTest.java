/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 01, 2018
 *  Last updated: Dec 01, 2018
 *
 *  Compilation:  javac APLineTest.java
 *  Execution:    java APLineTest
 *
 *  This program is the test bench for APLine.java
 *
 ******************************************************************************/

public class APLineTest
{
    public static void main(String[] args)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println("Slope: " + slope1);
        System.out.println("On line? " + onLine1 + "\n");
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);
        System.out.println("Slope: " + slope2);
        System.out.println("On line? " + onLine2 + "\n");
        
        APLine edge = new APLine(35, -48, -34);
        double slope3 = edge.getSlope();
        boolean onLine3 = edge.isOnLine(-3, 6);
        System.out.println("Slope: " + slope3);
        System.out.println("On line? " + onLine3);
    }
}