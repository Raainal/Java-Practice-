package strings;
class p3
{
    public static void main()
    {
        String s="Computer56 app";
        int j=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
            {
                continue;
            }
            else if(Character.isLetter(c))
            {
                j++;
            }
        }
        System.out.println(" No.  of letters excluding  vowels = "+j);
    }
}