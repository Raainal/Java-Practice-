import java.util.*;
class sumproduct
{
    void sumofnos()
    {
        int no,sum=0;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        sum = sum + no;
        no=sc.nextInt();
        sum = sum + no;
        no=sc.nextInt();
        sum = sum + no;
        no=sc.nextInt();
        sum = sum + no;
        no=sc.nextInt();
        sum = sum + no;
        System.out.println("The sum of those 5 nos is="+sum);
    }
    void productofnos()
    {
        int no,product=1;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        product = product + no;
        no=sc.nextInt();
        product = product + no;
        no=sc.nextInt();
        product = product + no;
        no=sc.nextInt();
        product = product + no;
        no=sc.nextInt();
        product = product + no;
        System.out.println("The product of those 5 nos is="+product);
    }
}