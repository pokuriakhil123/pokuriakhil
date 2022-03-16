import java.util.Scanner;
class Dog
{
    String name;
    String color;
    String bread;
    String eyecolor;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name= sc.next();
        System.out.println("Enter color ");
        color= sc.next();
        System.out.println("Enter bread ");
        bread= sc.next();
        System.out.println("Enter eyecolor ");
        eyecolor= sc.next();
    }
    void display()
    {
        System.out.println(name+" "+color+" "+bread+" "+eyecolor);
    }
    void bark()
    {
        System.out.println(name+" barking");
    }
    void eat()
    {
        System.out.println(name+" eating");
    }
    
}
class oops3_Dog_sc
{
    public static void main(String args[])
    {
        Dog dg1=new Dog();
        dg1.input();
        System.out.println("print all the information of dog");
        dg1.display();
        dg1.bark();
        dg1.eat();
        
        Dog dg2=new Dog();
        dg2.input();
        System.out.println("print all the information of dog");
        dg2.display();
        dg2.bark();
        dg2.eat();


}
}
