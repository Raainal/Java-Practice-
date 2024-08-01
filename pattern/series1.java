package pattern;
class series1
{
    public static void main()
    {
        int a=1;
        
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            System.out.println(-a);
            else
            System.out.println(a);
            a+=2;
            
        }
    }
}