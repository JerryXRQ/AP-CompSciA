/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 4, 2018
 *  Last updated: Nov 4, 2018
 *
 *  Compilation:  javac GeneExtraction.java
 *  Execution:    java GeneExtraction
 *
 *  This program determines whether a gene is present in a DNA sequence.
 *
 ******************************************************************************/

public class GeneExtraction
{
    public static String geneSequence(String dna)
    {
        int count=0;
        int length=dna.length();
        int start=0;
        int stop=0;
        while(count<length-3)
        {
            String codon=dna.substring(count,count+3);
            if(codon.equals("ATG"))
            {
                start=count;
                count=length;
            }
            else
            {
                count++;
            }
        }
        int newcount=start;
        while(newcount<length-3)
        {
            String codon1=dna.substring(newcount,newcount+3);
            if(codon1.equals("TAA"))
            {
                stop=newcount;
                newcount=length;
            } 
            else if(codon1.equals("TAG"))
            {
                stop=newcount;
                newcount=length;
            }
            else if(codon1.equals("TGA"))
            {
                stop=newcount;
                newcount=length;
            }
            newcount+=3;
        }
        if(stop==0)
        {
            return "INVALID";
        }
        String newcode=dna.substring(start,stop+3);
        int leng=newcode.length();            
        int CG=0;
        int coun=0;
        if(leng%3!=0||leng/3<5)
        {
            return "INVALID";
        }
        while(coun<leng)
        {
            String letter=newcode.substring(coun,coun+1);
            if(letter.equals("C"))
            {
                CG+=1;
            }
            if(letter.equals("G"))
            {
                CG+=1;
            }
            coun++;
        }
        double ratio = 1.0*CG / leng;
        String end="";
        if(ratio>=0.3)
        {
            end= newcode;
            
        }
        else
        {
            end="INVALID";
            
        }
        return end;
    }
    
    
    public static void main(String[] args)
    {
        String result = geneSequence("GTCATGCTACGTACGTATCGAGTCTCGTAACTG");
        System.out.println(result);
    }
}