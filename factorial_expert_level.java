import java.util.*;
public class factorial_expert_level
{
    int fact(int v)
    {
        int a=1;
        for(int i=1;i<=v;i++)
        {
            a=i*a;
        }
        System.out.println("the factorial is "+a);
        return a;
        
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,m,s,g;
        int a1,a2,a3;
        System.out.println("Enter n which is the bigger no");
        n=sc.nextInt();
        System.out.println("Enter m which is the smaller no");
        m=sc.nextInt();
        s=n/(m*(n-m));
        factorial_expert_level obj=new factorial_expert_level();
        a1=obj.fact(n);
        a2=obj.fact(m);
        g=a1-a2;
        a3=obj.fact(g);
        s=a1/(a2*(a3));
        System.out.println("the ans is"+s);
    }
}