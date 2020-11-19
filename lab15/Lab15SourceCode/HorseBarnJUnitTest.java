/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 14, 2019
 *  Last updated: Apr 14, 2019
 *
 *  Compilation:  javac HorseBarnJUnitTest.java
 *  Execution:    java HorseBarnJUnitTest
 *  
 *  This program is the JUnit test bench for HorseBarn.java
 *
 ******************************************************************************/
import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HorseBarnJUnitTest
{
    private Horse[] stables;
    private Horse[] roster;
    private HorseBarn sweetHome;
    private HorseBarn greenAcres;
    
    @Before
    public void runBeforeEachTest()
    {
        stables = new Horse[7];
        stables[0] = new Thoroughbred("Trigger", 1340);
        stables[2] = new Thoroughbred("Silver", 1210);
        stables[3] = new Thoroughbred("Lady", 1575);
        stables[5] = new Thoroughbred("Patches", 1350);
        stables[6] = new Thoroughbred("Duke", 1410);
        roster = new Horse[7];
        sweetHome = new HorseBarn(stables);
    }
    
    @After
    public void runAfterEachTest()
    {
        stables = null;
        roster = null;
        sweetHome = null;
        greenAcres = null;
    }
    
    @Test
    public void findHorseSpaceTestOne()
    {
        int expected = 0;
        int actual = sweetHome.findHorseSpace("Trigger");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findHorseSpaceTestTwo()
    {
        int expected = 2;
        int actual = sweetHome.findHorseSpace("Silver");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findHorseSpaceTestThree()
    {
        int expected = -1;
        int actual = sweetHome.findHorseSpace("Coco");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findHorseSpaceTestFour()
    {
        int expected = 6;
        int actual = sweetHome.findHorseSpace("Duke");
        assertEquals(expected, actual);
    }
    
    @Test
    public void findHorseSpaceTestFive()
    {
        int expected = -1;
        int actual = sweetHome.findHorseSpace("Potato");
        assertEquals(expected, actual);
    }
    
    @Test
    public void consolidateTestSix()
    {
        roster[0] = new Thoroughbred("Trigger", 1340);
        roster[2] = new Thoroughbred("Silver", 1210);
        roster[5] = new Thoroughbred("Patches", 1350);
        roster[6] = new Thoroughbred("Duke", 1410);
        greenAcres = new HorseBarn(roster);
        greenAcres.consolidate();
        String[] expected = {"Trigger", "Silver", "Patches", "Duke", null, null, null};
        String[] actual = new String[7];
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                actual[i] = roster[i].getName();
            }
            else
            {
                actual[i] = null;
            }
        }
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void consolidateTestSeven()
    {
        roster[2] = new Thoroughbred("Silver", 1210);
        roster[5] = new Thoroughbred("Patches", 1350);
        roster[6] = new Thoroughbred("Duke", 1410);
        greenAcres = new HorseBarn(roster);
        greenAcres.consolidate();
        String[] expected = {"Silver", "Patches", "Duke", null, null, null, null};
        String[] actual = new String[7];
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                actual[i] = roster[i].getName();
            }
            else
            {
                actual[i] = null;
            }
        }
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void consolidateTestEight()
    {
        roster[3] = new Thoroughbred("Patches", 1350);
        roster[6] = new Thoroughbred("Duke", 1410);
        greenAcres = new HorseBarn(roster);
        greenAcres.consolidate();
        String[] expected = {"Patches", "Duke", null, null, null, null, null};
        String[] actual = new String[7];
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                actual[i] = roster[i].getName();
            }
            else
            {
                actual[i] = null;
            }
        }
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void consolidateTestNine()
    {
        roster[2] = new Thoroughbred("Silver", 1210);
        roster[5] = new Thoroughbred("Patches", 1350);
        greenAcres = new HorseBarn(roster);
        greenAcres.consolidate();
        String[] expected = {"Silver", "Patches", null, null, null, null, null};
        String[] actual = new String[7];
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                actual[i] = roster[i].getName();
            }
            else
            {
                actual[i] = null;
            }
        }
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void consolidateTestTen()
    {
        roster[6] = new Thoroughbred("Duke", 1410);
        greenAcres = new HorseBarn(roster);
        greenAcres.consolidate();
        String[] expected = {"Duke", null, null, null, null, null, null};
        String[] actual = new String[7];
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                actual[i] = roster[i].getName();
            }
            else
            {
                actual[i] = null;
            }
        }
        assertArrayEquals(expected, actual);
    }
}
