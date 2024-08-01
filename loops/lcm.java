package loops;
class lcm
{
    public static void main(int a,int b)
    {
        int lcm=a;
        for (int i=2;a!=b;i++)
        {
            
            if (lcm%a==0 && lcm%b==0)
            {
                a=lcm;
                break;
            }
            lcm=a*i;
        }
        System.out.println(a);
    }
}