
/**
 * 在这里给出对类 Test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Test
{
    String name="entrepreneurship";
    int length= name.length();
    int a = 1;
    String vow="aeiou";
    while (a<length)
    {
        String character= name.substring(a-1,a);
        int det = vow.indexof(character);
        if (det == -1)
        {
            System.out.println("Character number" + a + "is 辅音");
            a++;
        }
        else
        {
            System.out.println("Character number" + a + "is 元音");
            a++;
        }
        
    }
}
