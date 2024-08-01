package strings;
class p6
{
    public static void main()
    {
        String s="WE ARE LIVING IN  COMPUTER WORLD.";
        int count=0;
        char c1='e';
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if (c==c1)
                {
                    count++;
                }

        }
        System.out.println("the occerance of the letter "+c1+" is "+count);
    }
}