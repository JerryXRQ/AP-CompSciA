/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Oct 28, 2018
 *  Last updated: Oct 28, 2018
 *
 *  Compilation:  javac GeneDetection.java
 *  Execution:    java GeneDetection
 *
 *  This program determines which genes are present in a DNA sequence.
 *
 ******************************************************************************/

public class GeneDetection
{
    public static String findGene(String dna, String stopCodon)
    {
        int length = 0;
        int total=dna.length();
        int start=0;
        int stop=0;
        while (length+3<=total)
        {
            String news=dna.substring(length,length+3);
            if (news.equals("ATG"))
            {
                if (start==0)
                {
                    start=length;
                    length++;
                }
                else
                {
                    length++;
                }
            }
            if (news.equals(stopCodon))
            {
                stop=length+3;
                length++;
            }
            else
            {
                length++;
            }
            
        }
        String result=dna.substring(start,stop);
        return result;
    }
    
    public static void main(String[] args)
    {
        String sequence = "ATATGTAGCTAGCATAATA";
        System.out.println("DNA: " + sequence);
        String result = findGene(sequence, "TAA");
        System.out.println("Gene: " + result);
    }
}
