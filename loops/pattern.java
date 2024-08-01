package loops;
import java.util.*;
class pattern
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int a,b,c;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=(i*i*i)-1;
            System.out.println(a+"   ");
        }
    }
}