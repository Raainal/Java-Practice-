package Sorting;
public class selection_sort
{
    public static void main()
    {
        int a[]={6,5,4,2};
        for (int i=0;i<a.length;i++)
        {
            int index=i;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[index]>a[i])
                    index=j;
            }
            int t=a[index];
            a[index]=a[i];
            a[i]=t;
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
