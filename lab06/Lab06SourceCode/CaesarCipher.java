/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 10, 2018
 *  Last updated: Nov 10, 2018
 *
 *  Compilation:  javac CaesarCipher.java
 *  Execution:    java CaesarCipher
 *
 *  This program encrypts a message using the caesar cipher.
 *
 ******************************************************************************/

public class CaesarCipher
{
    public static String encrypt(String message, int key)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index=0;
        int length=message.length();
        String result="";
        while (index<=length-1)
        {
            String c = message.substring(index,index+1);
            if (c.equals(" "))
            {
                result+=" ";
                index++;
            }
            else
            {
                int p=alphabet.indexOf(c);
                int np= (p+key)%26;
                result+=alphabet.substring(np,np+1);
                index++;
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        String result = encrypt("hello", 1);
        System.out.println(result);
    }
}