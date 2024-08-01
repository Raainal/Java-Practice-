public class squares
{
    public int[] calculate()
    {
        int a[]={1,2,3,4,5};
        int b[]=new int[5];
        for(int i=0;i<=4;i++)
        {
            b[i]=a[i]*a[i];
            
        }
        return b;
    }
    public static void main()
    {
        squares a=new squares();
        int c[]=a.calculate();
        for(int i=0;i<=4;i++)
        {
            System.out.println(c[i]);
        }
    }
}