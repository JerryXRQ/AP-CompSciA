/******************************************************************************
 *  Author:       Jerry Xu Ruiqi
 *  Created:      Sep 5, 2018
 *  Last updated: Sep 5, 2018
 *
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  This program displays a simple greeting to the user. 
 *
 ******************************************************************************/

public class HelloWorld
{
    public static String displayMessage()
    {
        // Use the assignment operator to assign the message "hello world"
        // to the String variable "greetings".
        // YOUR CODE HERE
        String greetings="hello world";
        
        return greetings;
    }
    
    public static void main(String[] args)
    {
        String result = displayMessage();
        System.out.println(result);
    }
}
