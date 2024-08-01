package strings;
class p4
{
    public static void main()
    {
        String s="LAL KRISHNA ADVANI";
        System.out.print(s.charAt(0)+" ");
        System.out.print(s.charAt(s.indexOf(" ")+1)+" ");
        System.out.print(s.charAt(s.lastIndexOf(" ")+1)+" ");
    }
}