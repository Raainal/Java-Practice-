package arrays;



import java.util.*;
class array_2d_demo_sum_diagonaland2corners
{
    public static void main()
    {   
        Scanner sc=new Scanner (System.in);
        int a[][]=new int [3][3];
        int b[][]={
                {10,11,15},{16,9,4},{1,2,3}};

        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");

        }
        System.out.println("sum");
        int c=0;
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                if (i==j)
                {
                    c+=a[i][j];

                }
                System.out.println("");
            }
        }
        c+=a[0][2]+a[2][0];
         System.out.println("sum"+c);
    }
}