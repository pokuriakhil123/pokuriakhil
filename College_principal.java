import java.util.*;
class Teacher
{
    String clg_name;
    String designation;
    String work;
    Scanner sc = new Scanner(System.in);
    void input1()
    {
        
        System.out.println("Enter college name ");
        clg_name= sc.next();
        System.out.println("Enter designation ");
        designation= sc.next();
        System.out.println("Enter work ");
        work= sc.next();
        
        
    }
    void display1()
    {
        System.out.println("college name : "+clg_name+"\ndesignation : "+designation+"\nwork : "+work);
    }
}
class MathTeacher extends Teacher
{
    void work()
    {
        System.out.println("works as Math teacher");
    }
}
class EnglishTeacher extends Teacher
{
    void work()
    {
        System.out.println("works as English Teacher teacher");
    }
}
class MusicTeacher extends Teacher
{
    void work()
    {
        System.out.println("works as Music teacher");
    }
}
class college_principal
{
    public static void main(String args[])
    {
        MathTeacher mth=new MathTeacher();
        mth.input1();
        mth.display1();
        mth.work();
        
        EnglishTeacher eng=new EnglishTeacher();
        eng.input1();
        eng.display1();
        eng.work();
      
        MusicTeacher msc=new MusicTeacher();
        msc.input1();
        msc.display1();
        msc.work();
        
    }
}
