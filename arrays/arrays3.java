package arrays;
import java.util.*;
class arrays3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("sum of no");
         int s =0;
        for(int i=0;i<a.length;i++)
        {
            
           
            s=s+a[i];
            
           
        }
         System.out.println(s);
    }
}