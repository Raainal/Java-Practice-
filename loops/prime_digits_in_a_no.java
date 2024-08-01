package loops;
class prime_digits_in_a_no
{
    public static void main(int ab)//7865
    {
        int x,b,c,d=ab,co;
        while (ab!=0)
        {
            c=ab%10;
            ab=ab/10;
            co = 0;
            for (int a=1;a<=c;a++)
            {

                if (c%a==0)
                {
                    co++;
                }
            }
            if (co==2)
            {
                System.out.println("it is a prime no"+c);
            }
        }
    }
}