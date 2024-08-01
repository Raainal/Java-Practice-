import java.util.*;
class cube
{
    public void cube(int a)
    {
        System.out.println(a*a*a);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        cube a=new cube();
        for (int i=0;i<=10;i++)
        {
            int b=sc.nextInt();
            a.cube(b);
        }
    }
}