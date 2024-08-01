package strings;
import java.util.*;
class p1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(Character.isUpperCase(c))
            {
                System.out.print(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c))
            {
                System.out.print(Character.toUpperCase(c));
            }
            else
            System.out.print(c);
        }
    }
}