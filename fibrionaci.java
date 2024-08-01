 
class fibrionaci
{
    public static void main(int n)
    {
        int f1=0,f2=1,t=0;
        System.out.println(f1);
        System.out.println(f2);
        n-=2;
        for (int i=1;i<=n;i++)
        {
            t=f1+f2;
            System.out.println(t);
            f1=f2;
            f2=t;
        }
    }
}