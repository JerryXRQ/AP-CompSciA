public class Test
{
     public static void surprise(int k, String nums)
     {
         if(k<nums.length())
         {
             System.out.print(nums.substring(k,k+1));
             surprise(k+1,nums);
             System.out.print(nums.substring(k,k+1));
         }
     }
     public static int doesWhat(int n)
     {
         if(n<=1)
         {
             return 1;
         }
         else if(n%2==0)
         {
             return n-doesWhat(n-1);
         }
         else
         {
             return n+doesWhat(n-1);
         }
     }
     public static int prod(int p)
     {
         if(p==1)
         {
             return 1;
         }
         else
         {
             return p*prod(p-1);
         }
     }
     public static void func(int n)
     {
         if(n==0)
         {
             System.out.print(" ");
         }
         else
         {
             System.out.print(n+ " ");
             func(n-1);
         }
     }
     public static int mystery(int n, int k)
     {
         if(k==0||n==k)
         {
             return 1;
         }
         else
         {
             return mystery(n-1,k-1)+mystery(n-1,k);
         }
     }
     public static void main(String[] args)
     {
         surprise(0, "123456789");
         System.out.print(doesWhat(7));
         System.out.print(prod(5));
         func(3);
         System.out.print(mystery(8,3));
     }
}

