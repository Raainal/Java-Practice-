package pattern;

public class pattern14
{
    public static void main()
    {
        int a=5847,sum=0;
        while(a!=0)
        {
            int b=a%10;
            sum=sum*10+b;
            System.out.println(sum);
            a/=10;
            
        }
    }
}
