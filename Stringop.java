
/**
 *
QUESTION 2:
Write a class program in Java with the following specifications:
Class name : Stringop
Data members : String str
Member functions :
Stringop() : parameterized cosntructor to initialize str.
void encode() : to replace and print each character of the string with the second next
character in the ASCII table.
Example : A with c, b with D and so on   
void print() : to print each word of the String in a separate line

 */
public class Stringop
{
    String str;
    public Stringop(String s)
    {
        str=s;
    }

    public void encode()
    {
        int c=0;
        for (int i=0;i<=str.length();i++)
        {
            char ch=str.charAt(i); 
            c=ch+2;
            System.out.println((char)c);         
        }

    }

    public void print()
    {
       for (int i=0;i<str.length();i++)
       {
           char ch1=str.charAt(i);
           if (ch1==' ')
           System.out.println();
           else 
           System.out.print(ch1);
        }
    }

    static void main()
    {
      Stringop g=new Stringop("bleh bleh bleh");
        g.encode();
        g.print();
    }
}
