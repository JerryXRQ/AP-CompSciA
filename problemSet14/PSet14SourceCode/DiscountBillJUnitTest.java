/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 19, 2018
 *  Last updated: Feb 19, 2018
 *
 *  Compilation:  javac DiscountBillJUnitTest.java
 *  Execution:    java DiscountBillJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiscountBillJUnitTest
{
    private DiscountBill member;
    private DiscountBill nonmember;
    
    @Before
    public void runBeforeEachTest()
    {
        member = new DiscountBill(true);
        nonmember = new DiscountBill(false);
    }
    
    @After
    public void runAfterEachTest()
    {
        member = null;
        nonmember = null;
    }
    
    @Test
    public void getTotalTestOne()
    {
        member.purchase(new Product(1.00, 0.25));
        member.purchase(new Product(2.00, 0.5));
        member.purchase(new Product(4.00, 0.75));
        member.purchase(new Product(5.00, 0.0));
        double expected = 7.75;
        double actual = member.getTotal();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getTotalTestTwo()
    {
        nonmember.purchase(new Product(5.00, 0.98));
        nonmember.purchase(new Product(3.50, 0.83));
        nonmember.purchase(new Product(4.25, 0.81));
        nonmember.purchase(new Product(2.75, 0.0));
        double expected = 15.5;
        double actual = nonmember.getTotal();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountCountTestThree()
    {
        member.purchase(new Product(1.00, 0.25));
        member.purchase(new Product(2.00, 0.5));
        member.purchase(new Product(4.00, 0.75));
        member.purchase(new Product(5.00, 0.0));
        int expected = 3;
        int actual = member.getDiscountCount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void getDiscountCountTestFour()
    {
        nonmember.purchase(new Product(5.00, 0.98));
        nonmember.purchase(new Product(3.50, 0.83));
        nonmember.purchase(new Product(4.25, 0.81));
        nonmember.purchase(new Product(2.75, 0.0));
        int expected = 0;
        int actual = nonmember.getDiscountCount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void getDiscountAmountTestFive()
    {
        member.purchase(new Product(1.00, 0.25));
        member.purchase(new Product(2.00, 0.5));
        member.purchase(new Product(4.00, 0.75));
        member.purchase(new Product(5.00, 0.0));
        double expected = 4.25;
        double actual = member.getDiscountAmount();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountAmountTestSix()
    {
        nonmember.purchase(new Product(5.00, 0.98));
        nonmember.purchase(new Product(3.50, 0.83));
        nonmember.purchase(new Product(4.25, 0.81));
        nonmember.purchase(new Product(2.75, 0.0));
        double expected = 0.0;
        double actual = nonmember.getDiscountAmount();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountPercentTestSeven()
    {
        member.purchase(new Product(1.00, 0.25));
        member.purchase(new Product(2.00, 0.5));
        member.purchase(new Product(4.00, 0.75));
        member.purchase(new Product(5.00, 0.0));
        double expected = 35.42;
        double actual = member.getDiscountPercent();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountPercentTestEight()
    {
        nonmember.purchase(new Product(5.00, 0.98));
        nonmember.purchase(new Product(3.50, 0.83));
        nonmember.purchase(new Product(4.25, 0.81));
        nonmember.purchase(new Product(2.75, 0.0));
        double expected = 0.0;
        double actual = nonmember.getDiscountPercent();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getTotalTestNine()
    {
        member.purchase(new Product(8.39, 0.63));
        member.purchase(new Product(3.87, 0.94));
        member.purchase(new Product(5.23, 0.0));
        member.purchase(new Product(9.44, 0.51));
        member.purchase(new Product(7.92, 0.74));
        member.purchase(new Product(6.48, 0.29));
        double expected = 19.85;
        double actual = member.getTotal();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getTotalTestTen()
    {
        nonmember.purchase(new Product(2.84, 0.82));
        nonmember.purchase(new Product(9.73, 0.0));
        nonmember.purchase(new Product(4.38, 0.71));
        nonmember.purchase(new Product(3.29, 0.23));
        nonmember.purchase(new Product(8.72, 0.89));
        nonmember.purchase(new Product(2.83, 0.64));
        double expected = 31.79;
        double actual = nonmember.getTotal();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountCountTestEleven()
    {
        member.purchase(new Product(8.39, 0.63));
        member.purchase(new Product(3.87, 0.94));
        member.purchase(new Product(5.23, 0.0));
        member.purchase(new Product(9.44, 0.51));
        member.purchase(new Product(7.92, 0.74));
        member.purchase(new Product(6.48, 0.29));
        int expected = 5;
        int actual = member.getDiscountCount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void getDiscountCountTestTwelve()
    {
        nonmember.purchase(new Product(2.84, 0.82));
        nonmember.purchase(new Product(9.73, 0.0));
        nonmember.purchase(new Product(4.38, 0.71));
        nonmember.purchase(new Product(3.29, 0.23));
        nonmember.purchase(new Product(8.72, 0.89));
        nonmember.purchase(new Product(2.83, 0.64));
        int expected = 0;
        int actual = nonmember.getDiscountCount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void getDiscountAmountTestThirteen()
    {
        member.purchase(new Product(8.39, 0.63));
        member.purchase(new Product(3.87, 0.94));
        member.purchase(new Product(5.23, 0.0));
        member.purchase(new Product(9.44, 0.51));
        member.purchase(new Product(7.92, 0.74));
        member.purchase(new Product(6.48, 0.29));
        double expected = 21.48;
        double actual = member.getDiscountAmount();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountAmountTestFourteen()
    {
        nonmember.purchase(new Product(2.84, 0.82));
        nonmember.purchase(new Product(9.73, 0.0));
        nonmember.purchase(new Product(4.38, 0.71));
        nonmember.purchase(new Product(3.29, 0.23));
        nonmember.purchase(new Product(8.72, 0.89));
        nonmember.purchase(new Product(2.83, 0.64));
        double expected = 0.0;
        double actual = nonmember.getDiscountAmount();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountPercentTestFifteen()
    {
        member.purchase(new Product(8.39, 0.63));
        member.purchase(new Product(3.87, 0.94));
        member.purchase(new Product(5.23, 0.0));
        member.purchase(new Product(9.44, 0.51));
        member.purchase(new Product(7.92, 0.74));
        member.purchase(new Product(6.48, 0.29));
        double expected = 51.97;
        double actual = member.getDiscountPercent();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getDiscountPercentTestSixteen()
    {
        nonmember.purchase(new Product(2.84, 0.82));
        nonmember.purchase(new Product(9.73, 0.0));
        nonmember.purchase(new Product(4.38, 0.71));
        nonmember.purchase(new Product(3.29, 0.23));
        nonmember.purchase(new Product(8.72, 0.89));
        nonmember.purchase(new Product(2.83, 0.64));
        double expected = 0.0;
        double actual = nonmember.getDiscountPercent();
        assertEquals(expected, actual, 0.1);
    }
}