import java.util.*;
public class LinkedListReverse
{
    public static void main(String[]args)
    {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Naga");
        ll.add("Durga");
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}