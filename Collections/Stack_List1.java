import java.util.*;
class Stack_List1
{
    public static void main(String args[])
    {
        Stack<Integer> lst= new Stack();
        lst.add(25);
        lst.add(43);
        lst.add(12);
        lst.push(48);
        lst.push(75);
        lst.push(86);
        lst.push(null);
        lst.pop();
        lst.remove(1);
        System.out.println(lst.get(3));
        System.out.println(lst.indexOf(12));
        System.out.println(lst);
    }
}