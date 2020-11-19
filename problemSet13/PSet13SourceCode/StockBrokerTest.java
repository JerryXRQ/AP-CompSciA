/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 12, 2017
 *  Last updated: Dec 12, 2017
 *
 *  Compilation:  javac StockBrokerTest.java
 *  Execution:    java StockBrokerTest
 *
 ******************************************************************************/

public class StockBrokerTest
{
    public static void main(String[] args)
    {
        StockBroker baidu = new StockBroker();
        baidu.purchase(20, 3.50);
        baidu.purchase(10, 2.00);
        double profit = baidu.getProfit(4.00);
        System.out.println("Profit earned = " + profit);
    }
}