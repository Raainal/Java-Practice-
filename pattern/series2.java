package pattern;
class series2
{
    public static void main()
    {
        int a=2,b=3;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a);
            a=a+b;
            b=b+2;
        }
    }
}