package strings;
class p8
{
    public static void main()
    {
        String s="RAIN WATER HARVWESTING ORGANISED BY JUSCO";
        int count1=0,count2=0,count3=0,count4=0,count5=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='a'||c=='A')
            {
                count1++;

            }
            else if (c=='e'||c=='E')
            {
                count2++;

            }
            else if (c=='i'||c=='I')
            {
                count3++;

            }
            else if (c=='o'||c=='O')
            {
                count4++;

            }
            else if (c=='u'||c=='U')
            {
                count5++;

            }

        }
        System.out.println("Frequency of ‘A’ = "+count1);
        System.out.println("Frequency of ‘e’ = "+count2);
        System.out.println("Frequency of ‘i’ = "+count3);
        System.out.println("Frequency of ‘o’ = "+count4);
        System.out.println("Frequency of ‘u’ = "+count5);
    }
}