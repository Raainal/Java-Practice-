import java.util.*;
class area
{
    public double area(double r)
    {
        double a1=3.14*r*r;
        return a1;
    }
    public int area(int s)
    {
        int a2=s*s;
        return a2;
    }
    public int area(int l,int b)
    {
        int a3=l*b;
        return a3;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        area a=new area();
        System.out.println("Choose 1)for circle \n 2)for square\n 3)for rectangle\n 0)to exit");
        int c=sc.nextInt();
        double h=0;
        switch(c)
        {
            case 0:
            System.exit(0);
            break;
            case 1:
            h=a.area(2.4);
            break;
            case 2:
            h=a.area(2);
            break;
            case 3:
            h=a.area(2,4);
            break;
            default:System.out.println("wrong choice");
            
        }
        System.out.println(h);
    }
}