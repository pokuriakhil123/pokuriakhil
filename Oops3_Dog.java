class Dog
{
    String name;
    String color;
    String bread;
    String eyecolor;
    
    void bark()
    {
        System.out.println(name+" barking");
        
    }
    void eat()
    {
        System.out.println(name+" eating");
        
    }
    
}
class Oops3_Dog
{
    public static void main(String args[])
    {
        Dog dg1=new Dog();
        dg1.name="Snoopy";
        dg1.color="Brown";
        dg1.bread="Boxer";
        dg1.eyecolor="Red";
        
        System.out.println("print all the information of dog");
        System.out.println(dg1.name+" "+dg1.color+" "+dg1.bread+" "+dg1.eyecolor);
        dg1.bark();
        dg1.eat();
        
        Dog dg2=new Dog();
        dg2.name="Lucky";
        dg2.color="White";
        dg2.bread="pitbull";
        dg2.eyecolor="Black";
        
        System.out.println("print all the information of dog");
        System.out.println(dg2.name+" "+dg2.color+" "+dg2.bread+" "+dg2.eyecolor);
        dg2.bark();
        dg2.eat();


}
}
