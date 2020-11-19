/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Jan 22, 2018
 *  Last updated: Jan 22, 2018
 *
 *  Compilation:  javac LibraryTest.java
 *  Execution:    java LibraryTest
 *  
 *  The LibraryTest class provides a testbench for the Library class.
 *  
 *  DO NOT modify any code in this class.
 *
 ******************************************************************************/

public class LibraryTest
{
    public static void main(String[] args)
    {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        
        // Add four books to the first library
        System.out.println("Adding books to firstLibrary:");
        String tdvc = firstLibrary.addBook(new Book("The Da Vinci Code"));
        System.out.println(tdvc);
        String lpp = firstLibrary.addBook(new Book("Le Petit Prince"));
        System.out.println(lpp);
        String atotc = firstLibrary.addBook(new Book("A Tale of Two Cities"));
        System.out.println(atotc);
        String tlotr = firstLibrary.addBook(new Book("The Lord of the Rings"));
        System.out.println(tlotr);
        System.out.println();
        
        // Display library opening hours
        System.out.println("Library hours:");
        String openingHours = Library.displayOpeningHours();
        System.out.println(openingHours);
        System.out.println();
        
        // Display library addresses
        System.out.println("Library addresses:");
        String firstAddress = firstLibrary.displayAddress();
        System.out.println(firstAddress);
        String secondAddress = secondLibrary.displayAddress();
        System.out.println(secondAddress);
        System.out.println();
        
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        String takeOne = firstLibrary.borrowBook("The Lord of the Rings");
        System.out.println(takeOne);
        String takeTwo = firstLibrary.borrowBook("The Lord of the Rings");
        System.out.println(takeTwo);
        String takeThree = secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println(takeThree);
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        String firstBooks = firstLibrary.displayAvailableBooks();
        System.out.println(firstBooks);
        //System.out.println();
        System.out.println("Books available in the second library:");
        String secondBooks = secondLibrary.displayAvailableBooks();
        System.out.println(secondBooks);
        System.out.println();
        
        // Return The Lords of the Rings to the second library
        System.out.println("Returning The Lord of the Rings to the second library:");
        String secondReturn = secondLibrary.returnBook("The Lord of the Rings");
        System.out.println(secondReturn);
        System.out.println();
        
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings to the first library:");
        String firstReturn = firstLibrary.returnBook("The Lord of the Rings");
        System.out.println(firstReturn);
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstBooks = firstLibrary.displayAvailableBooks();
        System.out.println(firstBooks);
    }
}
