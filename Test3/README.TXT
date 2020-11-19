public class HelloWorld
{

     public void surprise(int k, String nums)
     {
         if(k<nums.length())
         {
             System.out.print(nums.substring(k,k+1));
             surprise(k+1,nums);
             System.out.print(nums.substring(k,k+1));
         }
     }
     public static void main(String[] args)
     {
         System.out.println(surprise(0,"123456789"));
     }
    
}