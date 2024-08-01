package arrays;
import java.util.*;
class arrays8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        double c=0;
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }

        for (int i=0;i<a.length;i++)
        {
            b+=a[i];
            c=b/10;
        }

        System.out.println("The sum is ="+b);
        System.out.println("The avg is ="+c);
    }
}
