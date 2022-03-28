import java.util.*;
class Linked_List1
{
    public static void main(String args[])
    {
        LinkedList<Integer> lst= new LinkedList();
        lst.add(25);
        lst.add(43);
        lst.add(12);
        lst.add(48);
        lst.add(75);
        lst.addFirst(10);
        lst.addLast(90);
        System.out.println(lst);
    }
}