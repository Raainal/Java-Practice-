class SI
{
    public static void main(double p,double y)
    {
        double si,roi;
        roi=(p<1000
        )?0.05:(p>1000&&p<=3000?0.07:p>3000?0.12:0.0);
        si=(p*y*roi);
        System.out.println("The simple interest is="+si);
    }
}