
package pattern;
// 54321
// 5432
// 543
// 54
// 5
class pattern7
{
    public static void main()
    {
        for (int a=1;a<=5;a++)
        {
            
             for (int i=5;i>=a;i--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}