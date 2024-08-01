package arrays;
import java.util.*;
class arrays5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        for( i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        //i=5
        for( i=0;i<a.length;i++)
        {
            int c=0;
            for(int j=1;j<=a[i];j++)
            {
                if (a[i]%j==0)
                {
                    c++;
                }
                
            }
            if (c==2)
                    System.out.println(a[i]+" is a prime no");
        }
    }
}