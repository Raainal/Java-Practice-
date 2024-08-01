package arrays;
import java.util.*;
class arrays9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];     
        int b[]=new int[10];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=9, j = 0;i>=0;i--,j++)
        {
            // System.out.println(a[i]);
            b[j]=a[i];
        }
        for (int i=0;i<a.length;i++)
        {
             System.out.println(b[i]);
        }
        
    }
}
