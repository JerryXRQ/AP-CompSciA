/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 02, 2019
 *  Last updated: Apr 02, 2019
 *
 *  Compilation:  javac SoundJUnitTest.java
 *  Execution:    java SoundJUnitTest
 *  
 *  This program is the JUnit test bench for Sound.java
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoundJUnitTest
{
    private int[] amplitudes;
    private Sound waveform;
    
    @Before
    public void runBeforeEachTest()
    {
        amplitudes = new int[] {0, 0, 0, 0};
        waveform = new Sound(amplitudes);
    }
    
    @After
    public void runAfterEachTest()
    {
        amplitudes = null;
        waveform = null;
    }
    
    @Test
    public void limitAmplitudeTestOne()
    {
        amplitudes = new int[] {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
        waveform = new Sound(amplitudes);
        int expected = 5;
        int actual = waveform.limitAmplitude(2000);
        assertEquals(expected, actual);
    }
    
    @Test
    public void limitAmplitudeTestTwo()
    {
        amplitudes = new int[] {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
        waveform = new Sound(amplitudes);
        waveform.limitAmplitude(2000);
        int[] expected = new int[] {40,2000,17,-2000,-17,-2000,2000,1048,-420,33,15,-32,2000,2000};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void limitAmplitudeTestThree()
    {
        amplitudes = new int[] {24,5461,-6245,46,248,4368,-6712,29,37,-2463,87,2386,91,68,1082,1351,916};
        waveform = new Sound(amplitudes);
        int expected = 8;
        int actual = waveform.limitAmplitude(1000);
        assertEquals(expected, actual);
    }
    
    @Test
    public void limitAmplitudeTestFour()
    {
        amplitudes = new int[] {24,5461,-6245,46,248,4368,-6712,29,37,-2463,87,2386,91,68,1082,1351,916};
        waveform = new Sound(amplitudes);
        waveform.limitAmplitude(1000);
        int[] expected = new int[] {24,1000,-1000,46,248,1000,-1000,29,37,-1000,87,1000,91,68,1000,1000,916};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void limitAmplitudeTestFive()
    {
        amplitudes = new int[] {5166,789,-1567,6871,-5867,7345,-8677,1385,68,-6735,-4868,154,-8648,-6865,38,2673,-1865,2486,376};
        waveform = new Sound(amplitudes);
        int expected = 9;
        int actual = waveform.limitAmplitude(3500);
        assertEquals(expected, actual);
    }
    
    @Test
    public void limitAmplitudeTestSix()
    {
        amplitudes = new int[] {5166,789,-1567,6871,-5867,7345,-8677,1385,68,-6735,-4868,154,-8648,-6865,38,2673,-1865,2486,376};
        waveform = new Sound(amplitudes);
        waveform.limitAmplitude(3500);
        int[] expected = new int[] {3500,789,-1567,3500,-3500,3500,-3500,1385,68,-3500,-3500,154,-3500,-3500,38,2673,-1865,2486,376};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void trimSilenceFromBeginningTestSeven()
    {
        amplitudes = new int[] {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
        waveform = new Sound(amplitudes);
        waveform.trimSilenceFromBeginning();
        int[] expected = new int[] {-14,0,-35,-39,0,-7,16,32,37,29,0,0};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void trimSilenceFromBeginningEight()
    {
        amplitudes = new int[] {0,0,0,0,0,0,0,0,0,65,84,0,0,41,54,0,0,38,0,0,0};
        waveform = new Sound(amplitudes);
        waveform.trimSilenceFromBeginning();
        int[] expected = new int[] {65,84,0,0,41,54,0,0,38,0,0,0};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void trimSilenceFromBeginningNine()
    {
        amplitudes = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,23,0,0,0,83,47,6,0,0,0,0,0,83,24,97,65,0,0,0,0,0,0};
        waveform = new Sound(amplitudes);
        waveform.trimSilenceFromBeginning();
        int[] expected = new int[] {23,0,0,0,83,47,6,0,0,0,0,0,83,24,97,65,0,0,0,0,0,0};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void trimSilenceFromBeginningTen()
    {
        amplitudes = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,21,0,0,0,0,0,0,0,0,0,0,87,0,0,0,0,0,0,0,0,0,34,0,0,0,0,0,0};
        waveform = new Sound(amplitudes);
        waveform.trimSilenceFromBeginning();
        int[] expected = new int[] {21,0,0,0,0,0,0,0,0,0,0,87,0,0,0,0,0,0,0,0,0,34,0,0,0,0,0,0};
        int[] actual = waveform.getSamples();
        assertArrayEquals(expected, actual);
    }
}