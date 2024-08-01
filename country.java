import java.util.*;
public class country
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        String a[] = new String [5];
        System.out.println ("Enter names of 5 countries");
        for (int i = 0; i<=4; i++)
        {
            a[i] = sc.nextLine();
        }
        for (int y = 0; y<4; y++)
        {
        for (int k = 0; k<4; k++)
        {
            int l = a[k].length();
            int l1 = a[k+1].length();
            if (l1<l)
            {
                String t = a[k];
                a[k] = a[k+1];
                a [k+1] = t;
            }
        }}
        for (int o = 0; o<=4; o++)
        {
            System.out.println (a[o]);
        }
    }
}