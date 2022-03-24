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
    }
    void display1()
    {
        System.out.println("college name : "+clg_name+"\ndesignation : "+designation);
    }
}
class ComputerTeacher extends Teacher
{
    void work()
    {
        System.out.println("works as computer teacher");
    }
}
class comp_tech
{
    public static void main(String args[])
    {
        ComputerTeacher cmp=new ComputerTeacher();
        cmp.input1();
        cmp.display1();
        cmp.work();
    }
}