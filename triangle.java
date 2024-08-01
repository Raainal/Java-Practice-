import java.util.*;
class triangle
{
    public  void decide(int x,int y,int z)
    {
        if (x==y||x==z)
        {
            System.out.println("it is equilateral");
        }
        else if(x==y&&x==z)
        {
            System.out.println("it is isoceles");
        }
        else
        {
            System.out.println("it is scalene");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        triangle a=new triangle();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        a.decide(5,5,5);
    }
}
