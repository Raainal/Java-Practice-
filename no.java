class no
{
    public static void factorial()
    {
        System.out.println("factorial is called");
        int a,b,c=1;
        for (int n=1;n<=5;n++)
        {
            c = 1;
            for (int i=1;i<=n;i++)
            {
                c=c*i;
                
            }
            System.out.println(c+"  ");
        }
    }
    public void evenodd()
    {
        System.out.println("evenodd is called");
        int a=56;
        if (a%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public boolean check()
    {
        System.out.println("prime is called");
        int c=0,b=12;
        for (int a=1;a<=b;a++)
            {

                if (b%a==0)
                {
                    c++;
                }
            }
            if (c==2)
            {
                return true;
            }
            else
            {
                return false;
            }
        
    }
    public static void main()
    {
        no d=new no();
        no.factorial();
        d.evenodd();
        boolean res=d.check();
        if (res==true)
        {
            System.out.println("12 is a prime no");
            
        }
        else
        {
            System.out.println("12 is a prime no");
        }
    }
}