package pattern;


/**
 *A
 *AB
 *ABC
 *ABCD
 *ABCDE
 */
class pattern11
{
    public static void main()
    {
        for (int a=65;a<=70;a++)
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
