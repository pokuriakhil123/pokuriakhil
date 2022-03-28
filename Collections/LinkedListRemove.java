import java.util.*;
public class LinkedListRemove
{
    public static void main(String[]args)
    {
    LinkedList<String>ll=new LinkedList<String>();
    ll.add("Durga");
    ll.add("Naga");
    ll.add("Ravi");
    ll.add("ajay");
    System.out.println("intial list of elements:"+ll);
    ll.remove("ajay");
    System.out.println("After invoking remove(index)method:"+ll);
}
}