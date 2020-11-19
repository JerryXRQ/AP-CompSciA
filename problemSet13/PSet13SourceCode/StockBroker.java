/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Feb 26, 2019
 *  Last updated: Feb 26, 2019
 *
 *  Compilation:  javac StockBroker.java
 *  Execution:    java StockBroker
 *
 ******************************************************************************/

import java.util.*;

public class StockBroker
{
    private ArrayList<Integer>shares=new ArrayList<Integer>();
    private ArrayList<Double> cost=new ArrayList<Double>();
    public StockBroker() 
    {
        ArrayList<Integer>shares =new ArrayList<Integer>();
        ArrayList<Double>cost =new ArrayList<Double>();
    }
    public double getProfit(double currentPrice) 
    {
        int l=shares.size();
        int counter1=0;
        int counter2=0;
        double totalcost=0;
        int totalshares=0;
        while (counter1<l)
        {
            totalshares+=shares.get(counter1);
            counter1+=1;
        }
        while (counter2<l)
        {
            totalcost+=cost.get(counter2);
            counter2+=1;
        }
        double Profit=totalshares*currentPrice-totalcost;
        return Profit;
    }
    public void purchase(int amount, double price)
    {
        double spend=amount*price;
        shares.add(amount);
        cost.add(spend);
    }

}