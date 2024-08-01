import java.util.*;
public class sort
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("ENTER A WORD TO SORT IT");
        String st = sc.next ();
        int l = st.length();
        char ch, t=st.charAt(0);
        String stt = "";
        for (int i = 0; i<l; i++)
        {
            if (st.charAt(i)<=t)
            {
                t = st.charAt(i);
            }
            stt = stt + t;
        }
        System.out.println ("SORTED = " + stt);
    }
}