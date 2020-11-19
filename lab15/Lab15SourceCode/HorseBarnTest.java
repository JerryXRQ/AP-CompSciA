/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 14, 2019
 *  Last updated: Apr 14, 2019
 *
 *  Compilation:  javac HorseBarnTest.java
 *  Execution:    java HorseBarnTest
 *  
 *  This program simulates a horse barn that contains a series of stalls.
 *
 ******************************************************************************/

public class HorseBarnTest
{
    public static void displayArray(Horse[] arr)
    {
        // Display the sorted array
        for (Horse item : arr)
        {
            if (item == null)
                System.out.print("null ");
            else
                System.out.print(item.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Thoroughbred trigger = new Thoroughbred("Trigger", 1340);
        Thoroughbred silver = new Thoroughbred("Silver", 1210);
        Thoroughbred lady = new Thoroughbred("Lady", 1575);
        Thoroughbred patches = new Thoroughbred("Patches", 1350);
        Thoroughbred duke = new Thoroughbred("Duke", 1410);

        // Part (a)
        Horse[] stables = new Horse[7];

        stables[0] = trigger;
        stables[2] = silver;
        stables[3] = lady;
        stables[5] = patches;
        stables[6] = duke;

        HorseBarn sweetHome = new HorseBarn(stables);

        System.out.println( sweetHome.findHorseSpace("Trigger") );
        System.out.println( sweetHome.findHorseSpace("Silver") );
        System.out.println( sweetHome.findHorseSpace("Coco") );
        
        // Part (b)
        Horse[] roster = new Horse[7];
        roster[0] = trigger;
        roster[2] = silver;
        roster[5] = patches;
        roster[6] = duke;

        HorseBarn belmont = new HorseBarn(roster);

        System.out.println("Before consolidation:");
        displayArray(roster);
        System.out.println("After consolidation:");
        belmont.consolidate();
        displayArray(roster);
    }
}
