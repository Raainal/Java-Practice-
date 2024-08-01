 
class hotel
{
    public static void main(int d)
    {
        int b,a;
        a=2500;
       
        System.out.println("days:"+d);
        switch(d)
        {
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:b=10;
            break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:b=15;
            break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:b=20;
            break;
            default:b=25;
        }
        int c,dis;
        c=a*d;
        dis=c-(c*(b/100));
        System.out.println("the amt that you need to pay is ₹"+dis+"/-");
        System.out.println("Have a nice day");
    }
}