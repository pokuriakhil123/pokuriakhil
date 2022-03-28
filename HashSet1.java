import java.util.*;
class HashSet1
{
    public static void main(String args[])
    {
        HashSet<Integer> lst= new HashSet();
        lst.add(25);
        lst.add(43);
        lst.add(12);
        lst.add(48);
        lst.add(75);
        lst.add(86);
        lst.add(null);
        lst.add(null);
        System.out.println(lst);
    }
}