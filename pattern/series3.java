package pattern;
class series3
{
    public static void main()
    {
        
        {
            int a=1,b=2,c=0,s;
             System.out.println(c); 
             System.out.println(a);
             System.out.println(b);
            for (int i=1;i<=7;i++)
            {
                s=a+b+c;
                System.out.println(s);
                c=a;
                a=b;
                b=s;
            }
        }
    }
}