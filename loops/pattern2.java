package loops;
import java.util.*;
class pattern2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double sum=0,k=1;
        for (int i=1;i<=3;i++)
        {
            sum=sum+k/(k+1);
            k+=2;
        }
        System.out.println(sum);
    }
}