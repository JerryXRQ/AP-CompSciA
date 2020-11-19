/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Feb 14, 2019
 *  Last updated: Feb 14, 2019
 *
 *  Compilation:  javac TemperatureGridTest.java
 *  Execution:    java TemperatureGridTest
 *
 ******************************************************************************/

public class TemperatureGridTest
{
    public static void main(String[] args)
    {
        double[][] weather = {  {95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
                                {0.0, 50.0, 50.0, 50.0, 50.0, 0.0},
                                {0.0, 40.0, 40.0, 40.0, 40.0, 0.0},
                                {0.0, 20.0, 20.0, 20.0, 20.0, 0.0},
                                {0.0, 0.0, 0.0, 0.0, 0.0, 0.0} };
        TemperatureGrid tg = new TemperatureGrid(weather);
        System.out.println(tg.computeTemp(2, 3));
        System.out.println(tg.computeTemp(1, 1));
        System.out.println(tg.computeTemp(0, 2));
        System.out.println(tg.computeTemp(1, 3));

        System.out.println(tg);
        tg.updateAllTemps(0.01);
        System.out.println(tg);
    }
}
