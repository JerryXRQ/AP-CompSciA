/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 21, 2018
 *  Last updated: Feb 21, 2018
 *
 *  Compilation:  javac CheckoutJUnitTest.java
 *  Execution:    java CheckoutJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckoutJUnitTest
{
    private Checkout register;
    
    @Before
    public void runBeforeEachTest()
    {
        register = new Checkout();
    }
    
    @After
    public void runAfterEachTest()
    {
        register = null;
    }
    
    @Test
    public void numberOfItemsTestOne()
    {
        register.purchase(new Cake("Black Forest", 2.25, 14.92));
        register.purchase(new Cookie("Oatmeal Raisin", 4, 10.87));
        int expected = 2;
        int actual = register.numberOfItems();
        assertEquals(expected, actual);
    }
    
    @Test
    public void totalCostTestTwo()
    {
        register.purchase(new Cake("Black Forest", 2.25, 14.92));
        register.purchase(new Cookie("Oatmeal Raisin", 4, 10.87));
        double expected = 37.2;
        double actual = register.totalCost();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void totalTaxTestThree()
    {
        register.purchase(new Cake("Black Forest", 2.25, 14.92));
        register.purchase(new Cookie("Oatmeal Raisin", 4, 10.87));
        double expected = 2.4;
        double actual = register.totalTax();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void numberOfItemsTestFour()
    {
        register.purchase(new Cake("Marble", 1.33, 12.89));
        register.purchase(new Cookie("Chocolate Chip", 3, 9.32));
        register.purchase(new Cake("Carrot", 1.5, 19.71));
        register.purchase(new Cake("Cream", 2.24, 13.94));
        int expected = 4;
        int actual = register.numberOfItems();
        assertEquals(expected, actual);
    }
    
    @Test
    public void totalCostTestFive()
    {
        register.purchase(new Cake("Marble", 1.33, 12.89));
        register.purchase(new Cookie("Chocolate Chip", 3, 9.32));
        register.purchase(new Cake("Carrot", 1.5, 19.71));
        register.purchase(new Cake("Cream", 2.24, 13.94));
        double expected = 80.2;
        double actual = register.totalCost();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void totalTaxTestSix()
    {
        register.purchase(new Cake("Marble", 1.33, 12.89));
        register.purchase(new Cookie("Chocolate Chip", 3, 9.32));
        register.purchase(new Cake("Carrot", 1.5, 19.71));
        register.purchase(new Cake("Cream", 2.24, 13.94));
        double expected = 5.2;
        double actual = register.totalTax();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void numberOfItemsTestSeven()
    {
        register.purchase(new Cake("Vanilla", 9.34, 13.89));
        register.purchase(new Cake("Raspberry", 4.87, 75.03));
        register.purchase(new Cake("Strawberry", 3.48, 24.37));
        register.purchase(new Cookie("Chocolate Chip", 6, 3.28));
        register.purchase(new Cookie("Thin Mint", 2, 5.93));
        register.purchase(new Cookie("Pecan", 9, 4.87));
        int expected = 6;
        int actual = register.numberOfItems();
        assertEquals(expected, actual);
    }
    
    @Test
    public void totalCostTestEight()
    {
        register.purchase(new Cake("Vanilla", 9.34, 13.89));
        register.purchase(new Cake("Raspberry", 4.87, 75.03));
        register.purchase(new Cake("Strawberry", 3.48, 24.37));
        register.purchase(new Cookie("Chocolate Chip", 6, 3.28));
        register.purchase(new Cookie("Thin Mint", 2, 5.93));
        register.purchase(new Cookie("Pecan", 9, 4.87));
        double expected = 586.2;
        double actual = register.totalCost();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void totalTaxTestNine()
    {
        register.purchase(new Cake("Vanilla", 9.34, 13.89));
        register.purchase(new Cake("Raspberry", 4.87, 75.03));
        register.purchase(new Cake("Strawberry", 3.48, 24.37));
        register.purchase(new Cookie("Chocolate Chip", 6, 3.28));
        register.purchase(new Cookie("Thin Mint", 2, 5.93));
        register.purchase(new Cookie("Pecan", 9, 4.87));
        double expected = 38.1;
        double actual = register.totalTax();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void totalTaxTestTen()
    {
        register.purchase(new Cake("Vanilla", 9.34, 13.89));
        register.purchase(new Cake("Raspberry", 4.87, 75.03));
        register.purchase(new Cake("Strawberry", 3.48, 24.37));
        register.purchase(new Cookie("Chocolate Chip", 6, 3.28));
        register.purchase(new Cookie("Thin Mint", 2, 5.93));
        double expected = 37.8;
        double actual = register.totalTax();
        assertEquals(expected, actual, 0.1);
    }
}