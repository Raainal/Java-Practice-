/**
 * Create a class Student with follwowing members
 * data members:
 * rollno : int
 * name: String
 * sub1
 * sub2
 * sub3
 * methods:
 * Student() - default constructor
 * Student() - parameterized constuctor
 * calculate() - returns sum of marks of 3 subjects
 * average() - returns the average 
 * display() - displays student details with marks
 * Create main method and create object of the class
 * and call above methods 
 */
public class Student
{
    int roll;
    String name;
    double s1,s2,s3;
    public Student()
    {
        roll=0;
        name="";
        s1=0.0;
        s2=0.0;
        s3=0.0;
    }

    public Student(int r,String n,double sub1,double sub2,double sub3)
    {
        roll=r;
        name=n;
        s1=sub1;
        s2=sub2;
        s3=sub3;
    }

    public double calculate()
    {
        return s1+s2+s3;
    }

    public double avg()
    {
        return calculate()/3;
    }
    
    public void display()
    {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(calculate());
        System.out.println(avg());
    }
    
    public static void main()
    {
        Student obj=new Student(20,"amal",99.3,88.5,77.5);
        obj.display();
    }
}