/******************************************************************************
 *  Author:       YOUR NAME HERE
 *  Created:      Dec 05, 2018
 *  Last updated: Dec 05, 2018
 *
 *  Compilation:  javac TrailTest.java
 *  Execution:    java TrailTest
 *
 *  This program determines whether a trail is level or difficult.
 *
 ******************************************************************************/

public class TrailTest
{
    public static void main(String[] args)
    {
        int[] heights = {100,150,105,120,90,80,50,75,75,70,80,90,100};
        Trail hikingPath = new Trail(heights);
        
        System.out.print("Level Trail? Should be true: ");
        System.out.println(hikingPath.isLevelTrailSegment(7, 10));
        
        System.out.print("Level Trail? Should be false: ");
        System.out.println(hikingPath.isLevelTrailSegment(2, 12));
        
        System.out.print("Difficult Trail? Should be true: ");
        System.out.println(hikingPath.isDifficult());
    }
}