
/**
 * 在这里给出对类 Test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class PassingParameters

{
    public static void displayTotal(int total)
    {
        total = 75;
        System.out.println(total);
    }
    public static void main(String[] args)
    {
        int score = 10;
        displayTotal(score);
        System.out.println(score);
    }
}
