class denominations
{
    public static void main(int x)
    {
        int a,b,c,d,e,f,com;
        a=2000;
        b=500;
        c=100;
        d=50;
        e=10;
        f=5;
        com=x/a;//1
        System.out.println("2000 "+com);
        x = x%a;//856
        com=x/b;//1
        System.out.println("500 "+com);
        x = x%b;//356
        com=x/c;//
        System.out.println("100 "+com);
                x =x%c;
        com=x/d;
        System.out.println("50 "+com);
                x = x%d;
        com=x/e;
        System.out.println("10 "+com);
                x = x%e;
        com=x/f;
        System.out.println("5  "+com);
    }
}