package arrays;
import java.util.*;
class arrays7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {
            if ((i*i)==a[i])
            {
                System.out.println(a[i]+"is a perfect square");
            }
        }
    }
}
