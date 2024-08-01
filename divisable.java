class divisable
{
    public static void d5(int no)
    {
        int f;
        f=no%5;
        if (f==0)
        {
            System.out.println("it is divisable by 5");
        }
        else
        {
            System.out.println("it is not divisable by 5");
        }
        return;
    }
    public static void d6(int no)
    {
        int f,g;
        f=no%3;
        g=no%2;
        if (f==0&g==0)
        {
            System.out.println("it is divisable by 6");
        }
        else
        {
            System.out.println("it is not divisable by 6");
        }
        return;
    }
}