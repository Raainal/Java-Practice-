import java.util.*;
class grade
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter carbon content");
        float cc=sc.nextFloat();
        System.out.println("Enter hardness");
        int h=sc.nextInt();
        System.out.println("Enter tensile strength");
        int ts=sc.nextInt();
        if(h>50&&ts>5600&&cc<0.7){
            System.out.println("grade 10");

        }
        else if(h>50&&cc<0.7&&ts>0)
        {
            System.out.println("grade 9");

        }
        else if(h<50&&cc<0.7&&ts>5600){
            System.out.println("grade 8");
        }
        else if(h>50&&cc>0.7&&ts>5600){
            System.out.println("grade 7");
        }
        else if(h>50||(cc>0&&cc<0.7)||ts>5600){
            System.out.println("Grade 6");
        }
        else
            System.out.println("F.A.L.T.U");
    }
}
