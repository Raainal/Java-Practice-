package pattern;
/**
 * 1111111
 * 1111122
 * 1111333
 * 1114444
 * 1155555
 * 1666666
 * 7777777
 */
public class pattern13
{
    public static void main()
    {
        for(int i=1;i<=7;i++)
        {
            int j=0;
            for( j=6;j<=i;j--)
            {
                System.out.print("1");
                
            }
            for(int k=1;j<=i;k++)
            {
                System.out.print(i);
                
            }
            
            System.out.println("");
        }
    }
}
