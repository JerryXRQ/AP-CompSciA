/******************************************************************************
 *  Author:       Jerry Xu
 *  Created:      Mar 15, 2019
 *  Last updated: Mar 15, 2019
 *
 *  Compilation:  javac TemperatureGrid.java
 *  Execution:    java TemperatureGrid
 *  
 *  This program updates a grid of temperature values.
 *
 ******************************************************************************/

public class TemperatureGrid
{
    private double[][] temps;

    public TemperatureGrid(double[][] tempArr)
    {
        temps = tempArr;
    }

    public double computeTemp(int row, int col)
    {
        double result=0;
        int rn=temps.length;
        int cn=temps[0].length;
        if(row==rn-1||row==0||col==cn-1||col==0)
        {
            result=temps[row][col];
        }
        
        else
        {        
            double t1=temps[row-1][col];
            double t2=temps[row+1][col];
            double t3=temps[row][col+1];
            double t4=temps[row][col-1];
            result=(t1+t2+t3+t4)/4.0;
        }
        return result;
    }

    public boolean updateAllTemps(double tolerance)
    {
        int rn=temps.length;
        int cn=temps[0].length;
        boolean result=true;
        double [][] newtemps=new double [rn][cn];
        for(int r=0;r<rn;r++)
        {
            for(int c=0;c<cn;c++)
            {
                double current=computeTemp(r,c);
                double change=current-temps[r][c];
                if(change<=-tolerance||change>=tolerance)
                {
                    result=false;
                }
                newtemps[r][c]=current;
            }
        }
        temps=newtemps;
        return result;
    }

    public String toString()
    {
        String result = "";
        for (double[] row : temps)
        {
            for (double item : row)
            {
                result += item + "\t";
            }
            result += "\n";
        }
        return result;
    }

    public double[][] getTemps()
    {
        return temps;
    }
}
