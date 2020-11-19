/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Dec 14, 2018
 *  Last updated: Dec 14, 2018
 *
 *  Compilation:  javac CodeWordChecker.java
 *  Execution:    java CodeWordChecker
 *
 *  This program checks if a string conforms to some criteria.
 *
 ******************************************************************************/

public class CodeWordChecker
{
    private int a=6;
    private int b=20;
    private String c;
    public CodeWordChecker(int mya, int myb, String myc)
    {
        a=mya;
        b=myb;
        c=myc;
    }
        public CodeWordChecker(String myd)
    {
        c=myd;
    }
    public boolean isValid(String mye)
    {
        int len=mye.length();
        int position = mye.indexOf(c);
        if (position==-1&&len<=b&&len>=a)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    
}
