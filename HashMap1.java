import java.util.*;
class HashMap1
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm= new HashMap();
        hm.put(1,"apple");
        hm.put(2,"bannana");
        hm.put(3,"cat");
        hm.put(4,"dog");
        hm.put(5,"elephant");
        hm.put(6,"fan");
        System.out.println(hm.get(2));
        //lst.add(null);
        System.out.println(hm);
    }
}