package loops;
class factorial_of_digits
{
    public static void main(int a)//897
    {
        int n=a,b=1,c=1;
        while (a!=0)
        {
            b=a%10;
            c = 1;
            for (int i=1;i<=b;i++)
            {
                c=c*i;
                
            }
            a=a/10;
            System.out.println(c);
        }
        
    }
}