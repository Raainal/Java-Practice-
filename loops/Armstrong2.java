package loops;
class Armstrong2
{
    public static void main()
    {
        for(int i=1;i<=1000;i++)
        {
            int n=i,a,b,c=0;
            while (n!=0)
            {
                
                b=n%10;
                c=c+(b*b*b);
                n=n/10;
            }
            if (c==i)
            {
                System.out.println(i);
            }
        }
    }
}