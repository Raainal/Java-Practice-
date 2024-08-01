package strings;
class p7
{
    public static void main()
    {
            String s="Apples the best med for us",word=" ";
            for (int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if (Character.isWhitespace(c))
                {
                    System.out.println(word);
                    word="";
                }
                else
                {
                    word=word+c;
                }
                
            }
            System.out.print(s.lastIndexOf(" ")+1);
            System.out.print(s.lastIndexOf(" ")+2);
    }
}