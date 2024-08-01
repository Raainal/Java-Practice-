package pattern;

/**
 *ABCDEF
 *ABCDE
 *ABCD
 *ABC
 *AB
 *A
 */
class pattern10
{
    public static void main()
    {
        for (int a=70;a>=65;a--)
        {

            for (int i=65;i<=a;i++)
            {
                char ch=(char)i;
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
