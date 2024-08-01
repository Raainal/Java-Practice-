import java.util.*;
public class present
{
    public void check(int a,int b)
    {
        int c=a,d=0,e=0;
        while (c!=0)
        {   
            d = c%10;// d = d%10   
            c/=10;
            if(d==b)
            {System.out.println(b+" is present");break;}
            else
            {System.out.println(b+" is not present");break;}
        }
    }
    public static void main()
    {
        present s=new present();
        s.check(256,5);
    }
}