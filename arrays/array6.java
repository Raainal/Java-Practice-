package arrays;
import java.util.*;
class array6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]={4,5,7,11,9,13,8,12};
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if(a[i]+a[j]==20)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}