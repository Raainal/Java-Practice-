package arrays;
import java.util.*;
class marks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int tot,c;int j=0;
        int avg[]=new int[5];
        int r[]=new int[5];
        int m1[]=new int[5];
        int m2[]=new int[5];
        int m3[]=new int[5];
        for(int i=0;i<=4;i++)
        {
            System.out.println("enter  roll no");
            r[i]=sc.nextInt();
            System.out.println("enter  m1");
            m1[i]=sc.nextInt();
            System.out.println("enter m2");
            m2[i]=sc.nextInt();
            System.out.println("enter m3");
            m3[i]=sc.nextInt();
        }
        System.out.println("Roll no\ttotal\taverage");
        for (int i=0;i<5;i++)
        {
            tot=m1[i]+m2[i]+m3[i];
            avg[i]=tot/3;
            System.out.println(r[1]+"\t"+tot+"\t"+avg[i]);
        }
        int max=avg[0];
        for (int i=1;i<avg.length;i++)
        {
            if(max<avg[i])
            {
                max=avg[i];
            }
            System.out.println("Maximum average is "+max);
            System.out.println("Maximum average roll no is "+r[i]);
        }

    }
}