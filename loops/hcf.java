package loops;
class hcf
{
    public static void main(int a,int b)
    {
        int r=1;
        for (;r!=0;)
        {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println(a);
    }
}