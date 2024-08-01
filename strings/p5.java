package strings;
class p5
{
    public static void main()
    {
        String s=" MOHANDAS KARAMCHAND GANDHI";
        // for (int i=0;i<=6;i++)
        // {
            // System.out.print(s.charAt(s.lastIndexOf(" ")+i));
        // }
        // for (int i=0;i<=20;i++)
        // {
            // System.out.print(s.charAt(s.indexOf(" ")+i));
        // }
        int n=s.length();
        System.out.print(s.substring(s.lastIndexOf(" "),n));
        System.out.print(s.substring(0,s.lastIndexOf(" ")));
    }
}