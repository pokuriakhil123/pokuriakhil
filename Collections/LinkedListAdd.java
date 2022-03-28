import java.util.*;
public class LinkedListAdd
{
    public static void main(String[]args)
    {
        LinkedList<String>ll=new LinkedList<String>();
        System.out.println("initial list of elements:"+ll);
        ll.add("Durga");
        ll.add("Naga");
        ll.add("vijay");
        ll.add("Ajay");
        System.out.println("After invoking add (Ee)method:"+ll);
        ll.add(1,"Ravi");
        System.out.println("After invoking add(int index,E element)method:"+ll);
        LinkedList<String>ll2=new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanuman");
        ll2.addAll(ll2);
        System.out.println("After invoking add All(int index,Collection<?extends E>c)method:"+ll);
    }
}