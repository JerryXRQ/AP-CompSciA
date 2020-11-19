/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Apr 26, 2019
 *  Last updated: Apr 26, 2019
 *
 *  Compilation:  javac CodeWordChecker.java
 *  Execution:    java CodeWordChecker
 *  
 *  This program determines whether a string conforms to some defined criteria.
 *
 ******************************************************************************/

public class CodeWordChecker implements StringChecker
{
    private int a1;
    private int b1;
    private String c1;
    
    public CodeWordChecker(int a, int b, String c)
    {
        a1=a;
        b1=b;
        c1=c;
    }
    public CodeWordChecker(String d)
    {
        a1=6;
        b1=20;
        c1=d;
    }
    public boolean isValid(String C)
    {
        int size=C.length();
        boolean result= true;
        int res=C.indexOf(c1);
        if(size<a1||size>b1)
        {
            result=false;
        }
        if(res!=-1)
        {
            result=false;
        }
        return result;
    }    
}
