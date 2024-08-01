
/**
 * Define da class named Fruitjuice with the following description:
Instanceb f variables/Data members:
intsv bf product-code    :   stores the product code number.
Stvring flavor       :   stores the flavor of the juice (e.g., orange, apple etc.)
String pack-type    : stores the type of packing (e.g. tera–pack, PET bottle etc.)
int q`product-size    : stores package size (e.g. 200 mL,400 mL etc.)
int product-price   : stores the price of the product
Member methods:
(i)  FruitJuice( )        : default constructor to initialize integer data members to 0 and  
string data member to “  ”.
(ii)void input( )          : to input and store the product code, flavor, pack type, pack 
size and product price.
(iii)void discount ( )  : to reduce the product price ny 10.
(iv) void display ( )    : to display the product code, flavor, pack type, pack size and    
product price.
 */
public class FruitJuice
{
    int product_code;String flavor,pack_type;int product_size,product_price;
    public FruitJuice()
    {
        product_code=0;
        pack_type="";
        flavor="";
        product_size=0;
        product_price=0;
    }
    public void input(int pc,String pt,String f,int ps,int pp)
    {
        product_code=pc;
        pack_type=pt;
        flavor=f;
        product_size=ps;
        product_price=pp;
    }
    public void discount()
    {
        
        product_size-=10;
    }
    public void display()
    {
        System.out.println(product_code);
        System.out.println(pack_type);
        System.out.println(flavor);
        System.out.println(product_size);
        System.out.println(product_price);
        
    }
    public static void main()
    {
        FruitJuice obj=new FruitJuice();
        obj.input(45564,"tetra","vanilla",1000,560);
        obj.discount();
        obj.display();
        
    }
}
