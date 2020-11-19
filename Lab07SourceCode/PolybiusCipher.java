/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Nov 23, 2018
 *  Last updated: Nov 23, 2018
 *
 *  Compilation:  javac PolybiusCipher.java
 *  Execution:    java PolybiusCipher
 *
 *  This program encrypts a message using the polybius cipher.
 *
 ******************************************************************************/

public class PolybiusCipher
{
    public static String decrypt(String message, String[][] key)
    {
        String alpha = "abcdef";
        String DM= "";
        int index=0;
        String sequence="";
        while(index<=message.length()-2)
        {
            String letter1= message.substring(index,index+1);
            String letter2= message.substring(index+1,index+2);
            int number1 = alpha.indexOf(letter1);
            int number2 = alpha.indexOf(letter2);
            sequence+=key[number1][number2];
            index+=2;
        }
        return sequence;
    }
    
    public static void main(String[] args)
    {
        String[][] key = {{"n", "a", "1", "c", "3", "h"},
                          {"8", "t", "b", "2", "o", "m"},
                          {"e", "5", "w", "r", "p", "d"},
                          {"4", "f", "6", "g", "7", "i"},
                          {"9", "j", "0", "k", "l", "q"},
                          {"s", "u", "v", "x", "y", "z"}};
        String message = "bcfbfeacbdadafcacafacacedfffffabfa";
        String result = decrypt(message, key);
        System.out.println(result);
    }
}