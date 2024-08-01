package arrays;
import java.util.*;
class arrays1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}