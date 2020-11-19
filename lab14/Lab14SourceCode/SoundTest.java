/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Apr 02, 2019
 *  Last updated: Apr 02, 2019
 *
 *  Compilation:  javac Sound.java
 *  Execution:    java Sound
 *  
 *  This program alters the amplitude of a sound wave.
 *
 ******************************************************************************/

public class SoundTest
{
    public static void main(String[] args)
    {
        int[] music = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
        Sound s1 = new Sound(music);
        int numChanges = s1.limitAmplitude(2000);
        System.out.println("numChanges = " + numChanges);
        System.out.println("\nResulting array with amplitude limits applied:");
        System.out.println(s1);

        int[] snippet = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
        Sound s2 = new Sound(snippet);
        s2.trimSilenceFromBeginning();
        System.out.println("\nResulting array with silence trimmed from beginning:");
        System.out.println(s2);
    }
}
