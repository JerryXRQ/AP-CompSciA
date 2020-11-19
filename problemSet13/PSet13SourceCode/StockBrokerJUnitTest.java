/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 12, 2017
 *  Last updated: Dec 12, 2017
 *
 *  Compilation:  javac StockBrokerJUnitTest.java
 *  Execution:    java StockBrokerJUnitTest
 *
 ******************************************************************************/

import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StockBrokerJUnitTest
{
    private StockBroker portfolio;
    
    @Before
    public void runBeforeEachTest()
    {
        portfolio = new StockBroker();
    }
    
    @After
    public void runAfterEachTest()
    {
        portfolio = null;
    }

    @Test
    public void getProfitTestOne()
    {
        portfolio.purchase(20, 3.50);
        portfolio.purchase(10, 2.00);
        double expected = 30.0;
        double actual = portfolio.getProfit(4.00);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getProfitTestTwo()
    {
        portfolio.purchase(93, 2.48);
        portfolio.purchase(75, 9.23);
        double expected = -17.37;
        double actual = portfolio.getProfit(5.39);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getProfitTestThree()
    {
        portfolio.purchase(38, 4.72);
        portfolio.purchase(43, 8.28);
        portfolio.purchase(64, 3.21);
        double expected = 670.01;
        double actual = portfolio.getProfit(9.73);
        assertEquals(expected, actual, 0.1);
    }
        
    @Test
    public void getProfitTestFour()
    {
        portfolio.purchase(87, 4.10);
        portfolio.purchase(24, 6.12);
        portfolio.purchase(39, 8.75);
        portfolio.purchase(62, 3.01);
        double expected = 825.67;
        double actual = portfolio.getProfit(8.76);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void getProfitTestFive()
    {
        portfolio.purchase(84, 7.52);
        portfolio.purchase(34, 9.87);
        portfolio.purchase(20, 3.98);
        portfolio.purchase(57, 4.37);
        portfolio.purchase(54, 3.87);
        double expected = 116.06;
        double actual = portfolio.getProfit(6.51);
        assertEquals(expected, actual, 0.1);
    }
}
