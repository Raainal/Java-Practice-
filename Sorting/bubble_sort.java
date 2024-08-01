package Sorting;
class bubble_sort
{
    public static void main()
    {
        int a[]={6,55,67,3,9};
        for(int i=0;i<=a.length;i++)
        {
            for(int j=0;j<=a.length-1;j++)
            {
                if(a[j-1] > a[j])
                {  
                    int t = a[j-1];  
                     a[j-1] = a[j];  
                         a[j] = t;
                }
            }
        }
    }
}