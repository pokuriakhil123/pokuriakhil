import java.util.*;
class Deque_List1
{
    public static void main(String args[])
    {
        ArrayDeque<Integer> lst= new ArrayDeque();
        lst.add(25);
        lst.add(43);
        lst.add(12);
        lst.add(48);
        lst.add(75);
        lst.add(86);
        //lst.rear(90);
        //lst.front(5);
        //lst.pop();
        lst.removeFirst();
        lst.removeLast();
        /*System.out.println("Element value of index is "+lst.get(3));
        System.out.println("Array position is "+lst.indexOf(12));*/
        System.out.println(lst);
    }
}