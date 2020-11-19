/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Jan 22, 2018
 *  Last updated: Jan 22, 2018
 *
 *  Compilation:  javac Book.java
 *  Execution:    java Book
 *  
 *  The Book class defines methods to perform the following actions:
 *  
 *    - get the title of a book
 *    - find out if the book is available
 *    - borrow the book
 *    - return the book
 *  
 *  DO NOT modify any code in this class.
 *
 ******************************************************************************/

public class Book
{
    String title;
    boolean borrowed;
    
    // Creates a new Book
    public Book(String bookTitle)
    {
        title = bookTitle;
        borrowed = false;
    }
    
    // Marks the book as rented
    public void rented()
    {
        borrowed = true;
    }
    
    // Marks the book as not rented
    public void returned()
    {
        borrowed = false;
    }
    
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed()
    {
        if (borrowed)
            return true;
        else
            return false;
    }
    
    // Returns the title of the book
    public String getTitle()
    {
        return title;
    }
}
