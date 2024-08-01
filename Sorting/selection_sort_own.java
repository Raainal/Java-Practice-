package Sorting;
class selection_sort_own
{
    public static void main()
    {
        int a[]={6,55,67,3,9};
        for (int i=0;i<=a.length;i++)
        {
            int index=i;
            for (int j=0;j<=a.length;j++)
            {
                if (a[index]>a[i])
                index=j;
            }
            int s=a[index];
                a[index]=a[i];
                a[i]=s;
        }
        for (int i=0;i<=a.length;i++)
        System.out.println(a[i]);
    }
}