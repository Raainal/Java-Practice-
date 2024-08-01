class leap_year
{
    public static void main( double yr)
    {
        double a;
        a=yr%4;
        if (a==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
        
    }
}