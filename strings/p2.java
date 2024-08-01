package strings;
class p2
{
    public static void main()
    {
        String s="Computer Applications";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
            {
                continue;
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}