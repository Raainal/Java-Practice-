import java.util.*;
class sum_of_digits_in_array
{
    public boolean validate(int no)
    {
        int c=no,d;
        if(no<=9)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public int sumofdigits(int n)
    {
        int c=n,d,s=0;
        while (c!=0)
        {   
            d = c%10;  
            c/=10;
            s=s+d;
        }
        return s;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        sum_of_digits_in_array obj1=new sum_of_digits_in_array();
        // boolean q=obj1.validate(25);
        //int w=obj1.sumofdigits(35);
        int p=0;
        //System.out.println("sum of digits is "+w);
        int x[]=new int[5];
        for (int i=0;i<=4;i++)
        {
            x[i]=sc.nextInt();
          //  boolean q=obj1.validate(x[i]);
           // while(!q)
           while(!obj1.validate(x[i]))
            {
                System.out.println("it is a single digit enter again");
                x[i]=sc.nextInt();
               // q=obj1.validate(x[i]);
            }
        }
        for (int j=0;j<=4;j++)
        {
            int sum=obj1.sumofdigits(x[j]);
             p=sum+sum;
        }
        System.out.println(p);
    }
}