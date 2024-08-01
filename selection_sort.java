public class selection_sort
{
    public static void main()
    {
        int a[]={26,84,61,62,92,6};
        System.out.print("The array is =");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
       
        for (int i=0;i<a.length;i++)
        {
            int b=i;
            for (int j=i;j<a.length;j++)
            {
                 if (a[j]<a[b])
                b=j;
            }
            int t=a[i];
            a[i]=a[b];
            a[b]=t;
        }
       
    
        System.out.println("new array is=");
        for (int i=0;i<a.length;i++)
        System.out.print(a[i]+"  ");
    }
}