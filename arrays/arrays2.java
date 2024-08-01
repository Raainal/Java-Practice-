package arrays;
import java.util.*;
class arrays2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("value\tsquare\tcube");
        for(int i=0;i<a.length;i++)
        {
            
            int s,q;
            s=a[i]*a[i];
            q=a[i]*a[i]*a[i];
            System.out.println(a[i]+"\t"+s+"\t"+q);
        }
    }
}