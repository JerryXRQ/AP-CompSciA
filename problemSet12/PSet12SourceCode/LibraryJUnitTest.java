/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Jan 22, 2018
 *  Last updated: Jan 22, 2018
 *
 *  Compilation:  javac LibraryJUnitTest.java
 *  Execution:    java LibraryJUnitTest
 *  
 *  The LibraryJUnitTest class provides a testbench for the Library class.
 *  
 *  DO NOT modify any code in this class.
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LibraryJUnitTest
{
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St.");
    
    @Test
    public void addBookTheDaVinciCode()
    {
        String expected = "You have successfully added The Da Vinci Code";
        String actual = firstLibrary.addBook(new Book("The Da Vinci Code"));
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void addBookLePetitPrince()
    {
        String expected = "You have successfully added Le Petit Prince";
        String actual = firstLibrary.addBook(new Book("Le Petit Prince"));
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void addBookATaleofTwoCities()
    {
        String expected = "You have successfully added A Tale of Two Cities";
        String actual = firstLibrary.addBook(new Book("A Tale of Two Cities"));
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void addBookTheLordoftheRings()
    {
        String expected = "You have successfully added The Lord of the Rings";
        String actual = firstLibrary.addBook(new Book("The Lord of the Rings"));
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void verifyOpeningHours()
    {
        String expected = "Libraries are open daily from 9am to 5pm.";
        String actual = Library.displayOpeningHours();
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void verifyFirstAddress()
    {
        String expected = "10 Main St.";
        String actual = firstLibrary.displayAddress();
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void verifySecondAddress()
    {
        String expected = "228 Liberty St.";
        String actual = secondLibrary.displayAddress();
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void borrowBookAvailable()
    {
        Library oneLibrary = new Library("10 Pearl St.");
        String lr = oneLibrary.addBook(new Book("The Lord of the Rings"));
        String expected = "You have successfully borrowed The Lord of the Rings";
        String actual = oneLibrary.borrowBook("The Lord of the Rings");
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void borrowBookUnavailable()
    {
        Library twoLibrary = new Library("20 Delaware Ave.");
        String lotr = twoLibrary.addBook(new Book("The Lord of the Rings"));
        String bl = twoLibrary.borrowBook("The Lord of the Rings");
        String expected = "Sorry, this book is already borrowed.";
        String actual = twoLibrary.borrowBook("The Lord of the Rings");
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void borrowBookNotInCatalog()
    {
        Library threeLibrary = new Library("30 Elmwood Ave.");
        String expected = "Sorry, this book is not in our catalog.";
        String actual = threeLibrary.borrowBook("The Lord of the Rings");
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void returnBookNotInCatalog()
    {
        Library fourLibrary = new Library("40 Hertel Ave.");
        String expected = "Sorry, this book is not in our catalog.";
        String actual = fourLibrary.returnBook("The Lord of the Rings");
        assertEquals("failure - Strings are not equal", expected, actual);
    }
    
    @Test
    public void returnBookInCatalog()
    {
        Library fiveLibrary = new Library("50 Colvin Ave.");
        String rlr = fiveLibrary.addBook(new Book("The Lord of the Rings"));
        String expected = "You have successfully returned The Lord of the Rings";
        String actual = fiveLibrary.returnBook("The Lord of the Rings");
        assertEquals("failure - Strings are not equal", expected, actual);
    }
}
