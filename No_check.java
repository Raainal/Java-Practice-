import java.util.*;
class No_check
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no and a digit in the no");
        int c,d,e;
        int a=sc.nextInt();
        int n=a;
        int b=sc.nextInt();
        while(a!=0)//139
        {
            c=a%10;//4
            a=a/10;//1
            if(c==b)
            {
                n--;//144
                a = n;
            }
        }
        System.out.println(n);
    }
}