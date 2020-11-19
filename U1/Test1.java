
/**
 * 在这里给出对类 Test1 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Test1
{
 
    public Test1()
    {
        
        String name="entrepreneurship";
        int length= name.length();
        int a = 1;
        while (a<length)
        {
            String character= name.substring(a-1,a);
            System.out.println(character);
            if (character.equals("a")||character.equals("e")||character.equals("i")||character.equals("o")||character.equals("u"))
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
}
    

