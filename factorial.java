class factorial
{
    public void for_loop()
    {
        int c=1;
        for (int n=1;n<=10;n++)
        {
            c = 1;
            for (int i=1;i<=n;i++)
            {
                c=c*i;
                
            }
            System.out.println(c+"  ");
        }
    }
    public void while_loop()
    {
         int c=1,n=1,i;
        while(n<=10)
        {
            c = 1;
            i=1;
            while (i<=n)
            {
                c=c*i;
                i++;
                System.out.println(c+"  ");
            }
            
            n++;
        }
    }
    public void do_while_loop()
    {
        int s,no=1,i=1;
        do
        {
            System.out.println();
            while (i<=10)
            do
            {
                s=no*i;
                System.out.print("   "+s);
                i++;
            }
            while (i<=10);
            no++;
        }
        while(no<=10);
    }
}