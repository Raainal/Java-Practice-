package arrays;
import java.util.*;
class arrays4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("product of no");
         int s =1;
        for(int i=0;i<a.length;i++)
        {
            
           
            s=s*a[i];
            
           
        }
         System.out.println(s);
    }
}