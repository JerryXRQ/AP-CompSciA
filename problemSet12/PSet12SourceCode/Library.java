/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Jan 22, 2018
 *  Last updated: Jan 22, 2018
 *
 *  Compilation:  javac Library.java
 *  Execution:    java Library
 *  
 *  The Library class defines methods to represent each library, and manage
 *  a collection of books.
 *
 ******************************************************************************/

import java.util.*;

public class Library
{
    private static String hours = "Libraries are open daily from 9am to 5pm.";
    private String address;
    private ArrayList<Book> bookInventory = new ArrayList<Book>();

    public Library(String libraryAddress)
    {
        address = libraryAddress;
    }
    
    // 2 points
    public static String displayOpeningHours()
    {
        return hours;
        
    }
    
    // 2 points
    public String displayAddress()
    {
        return address;     
    }
    
    // 2 points
    public String addBook(Book novel)
    {
        bookInventory.add(novel);
        return "You have successfully added "+novel.getTitle();
    }
    
    // 10 points
    public String borrowBook(String novelName)
    {
        String result="Sorry, this book is not in our catalog.";
        for (Book text: bookInventory)
        {
            if (novelName.equals(text.getTitle()))
            {
                boolean answer=text.isBorrowed();
                if(answer)
                {
                    result="Sorry, this book is already borrowed.";
                }
                else
                {
                    result="You have successfully borrowed "+novelName;
                    text.rented();
                }
            }
        }
        return result;    
    }

    public String displayAvailableBooks()
    {
        String catalog = "";
        if (bookInventory.isEmpty())
            catalog = "No books in our catalog.";
        else
        {
            for (Book text : bookInventory)
            {
                if (!text.isBorrowed())
                    catalog += text.getTitle() + "\n";
            }
        }
        return catalog;
    }
    
    // 5 points
    public String returnBook(String textName)
    {
        String result="Sorry, this book is not in our catalog.";
        for (Book text: bookInventory)
        {
            if (textName.equals(text.getTitle()))
            {
                result="You have successfully returned "+textName;                
            }
        }
        return result;
    }
    
}
