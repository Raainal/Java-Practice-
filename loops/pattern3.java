package loops;
import java.util.*;
class pattern3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int p=1,s=0;
        for(int i=1;i<=n;i++)
        {
            p*=i;
            s+=p;
        }
        System.out.println(s);
    }
}