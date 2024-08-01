class tables
{
    public void for_loop()
    {
        int s,no;
        for(no=1;no<=10;no++)
        {
            
            System.out.println();
            for(int i=1;i<=10;i++)
            {
                s=no*i;
                System.out.print("   "+s);
            }
        }
    }
    public void while_loop()
    {
        int s,no=1,i=1;
        while(no<=10)
        {
            System.out.println();
            while (i<=10)
            {
                s=no*i;
                System.out.print("   "+s);
                i++;
            }
            no++;
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