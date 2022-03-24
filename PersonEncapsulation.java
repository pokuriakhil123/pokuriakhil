import java.util.*;
class Person
{
    int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return this.age();
    }
}
class PersonEncapsulation
{
    public static void main(String args[])
    {
        Person a=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age : ");
        int ag=sc.nextInt();
        a.setAge(ag);
        System.out.println("your age is : ");
        System.out.println(a.getAge());
    }
}