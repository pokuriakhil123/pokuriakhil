import java.util.*;
public class VectorExample
{
    public static void main(String[]args)
    {
        Vector<String>vec=new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Cat");
        vec.addElement("Elephant");
        vec.addElement("Fox");
        vec.addElement("Rat");
        System.out.println("Elements are:"+vec);
    }
}