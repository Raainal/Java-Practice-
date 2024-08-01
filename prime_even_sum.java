/**
 * WAP to create  functions as follows :
1)	Prime – takes int as parameter and returns Boolean whether no is prime or not
2)	Even – takes int as parameter and returns Boolean if no is even or not
3)	Sumofnos – takes a no as parameter  and returns the sum of individual digits
Take a n-digit no as input from the user and perform the operations as follows :
a)	Find the sum of individual digits
b)	If sum is > 9, then check for individual digit if its even or odd. If even , 
print square of even digit, if odd, print odd nos if its prime

 */
import java.util.*;
class prime_even_sum
{
    public boolean prime(int no)
	{
		int c= 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}

    public boolean even(int a)
    {
        boolean b;
        if (a%2==0)
        {
            b=true;
        }
        else
        {
            b=false;
        }
        System.out.println(a+" is even -"+b);
        return b;
    }

    public int sumofno(int n)
    {
        int a,b,c,d,s=0,sq;
        a=n;
        for (int i=0;i<=n;i++)
        {
            b=a%10;
            a=a/10;
            s+=b;
        }
        return s;
        /** if (s>=9)
        {
        for (int i=0;i<=n;i++)
        {
        b=a%10;
        a=a/10;
        if (b%2==0)
        {
        c=b*b;
        System.out.println("square of "+b+" is "+c);
        c=0;
        }
        else
        {
        c=0;
        for ( i=1;i<=b;i++)
        {

        if (b%i==0)
        {
        c++;
        }
        }
        if (c==2)
        {
        System.out.println("it is a prime no"+b);

        }
        }
        }
         */}
         public static void main(String[] args)
         {
		prime_even_sum p1 = new prime_even_sum ();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int no = sc.nextInt();
		int s = p1.sumofno(no);
		System.out.println(s);
		if(s>9)
		{
			while(s != 0)
			{
				int r = s % 10;
				if(p1.even(r))
					System.out.println(r*r);
				else
					if(p1.prime(r))
						System.out.println(r);
				s = s/10;
			}
		}
	}
}

