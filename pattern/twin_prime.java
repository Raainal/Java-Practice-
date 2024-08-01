package pattern;
public class twin_prime
{
    public static void main()
    {
        int a,b;
        a=5;
        b=7;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<=a;i++)
        {
            if(a%i==0)
                c1++;
        }
        for(int i=0;i<=b;i++)
        {
            if(b%i==0)
                c2++;
        }
        if (c1==2 && c2==2)
        {
            int diff=b-a;
            for(int i=0;i<=b;i++)
            {
                if(diff%i==0)
                    c3++;
            }
            
        }   
    }
}