package loops;

class list_of_prime_no
{
    public static void main()
    {
        for (int x=1;x<=100;x++)
        {
            
            int c=0;   
            for (int a=1;a<=x;a++)
            {

                if (x%a==0)
                {
                    c++;
                }
            }
            if (c==2)
            {
                System.out.println("it is a prime no"+x);
            }
            // else 
            // {
                // System.out.println("it is not a prime no");
            // }
        }
    }
}