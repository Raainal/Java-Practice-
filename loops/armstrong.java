package loops;
class armstrong
{
    public static void main()
    {
        int x=154,a,b,c,d,e,f,g;
        a=153/10;
        b=153%10;
        c=a%10;
        d=a/10;
        e=d/10;
        f=d%10;
        g=(b*b*b)+(c*c*c)+(f*f*f);
        if (g==x)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}