import java.util.*;
class Vector_List1
{
    public static void main(String args[])
    {
        Vector<Integer> lst= new Vector();
        lst.add(25);
        lst.add(43);
        lst.add(12);
        lst.add(48);
        lst.add(75);
        /*lst.addFirst(10);
        lst.addLast(90);*/
        System.out.println(lst.get(3));
        System.out.println(lst.indexOf(12));
        System.out.println(lst);
    }
}