package pattern;
/**
 * 1
 * 11
 * 111
 * 1111
 * 11111
 */
class pattern4
{
    public static void main()
    {
        for (int a=5;a>=1;a--)
        {
            
             for (int i=5;i>=a;i--)
             {
                 System.out.print(1);
             }
            System.out.println();
        }
    }
}