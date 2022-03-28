import java.util.*;
class String_Task1
{
    public static void main(String args[])
    {
        String name= new String("Pokuri");
        String name1="Akhil";
        String newname=name.concat(name1);
        System.out.println("the length of the name is "+name.length());
        System.out.println("Compare strings"+name==name1);
        System.out.println("Concatenated string is :"+newname);
    }
}