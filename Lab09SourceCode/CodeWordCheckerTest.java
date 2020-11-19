/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 13, 2018
 *  Last updated: Dec 13, 2018
 *
 *  Compilation:  javac CodeWordCheckerTest.java
 *  Execution:    java CodeWordCheckerTest
 *
 *  This program is the test bench for CodeWordChecker.java
 *
 ******************************************************************************/

public class CodeWordCheckerTest
{
    public static void main(String[] args)
    {
        CodeWordChecker sc1 = new CodeWordChecker(5, 8, "$");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));
        
        CodeWordChecker sc2 = new CodeWordChecker("pass");
        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("Mypassport"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}