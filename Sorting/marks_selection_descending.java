package Sorting;
import java.util.*;
class marks_selection_descending
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int tot[]=new int[5],c;int j=0;
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
            tot[i]=m1[i]+m2[i]+m3[i];
            avg[i]=tot[i]/3;
            System.out.println(r[i]+"\t"+tot[i]+"\t"+avg[i]);
        }
             
        for (int i=0;i<avg.length;i++)
        {
            int index=i;
            for ( j=i+1;j<avg.length;j++)
            {
                if (avg[index]<avg[j])
                    index=j;
            }
            int t=avg[index];
            avg[index]=avg[i];
            avg[i]=t;
            
            t=r[index];
            r[index]=r[i];
            r[i]=t;
              t=m3[index];
            m3[index]=m3[i];
            m3[i]=t;
            
            t=m2[index];
            m2[index]=m2[i];
            m2[i]=t;
            
            
             t=m1[index];
            m1[index]=m1[i];
            m1[i]=t;
        
        
        }
        for (int i=0;i<avg.length;i++)
        {
            System.out.println(r[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+m1[i]+"\t"+m2[i]+"\t"+m3[i]);
        }

    }
}