import java.util.*;
class HashMap2
{
    public static void main(String args[])
    {
        HashMap<Integer,String> map= new HashMap();
        map.put(1,"apple");
        map.put(2,"bannana");
        map.put(3,"cat");
        map.put(4,"dog");
        map.put(5,"elephant");
        map.put(6,"fan");
        System.out.println(map.get(2));
        //lst.add(null);
        for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map);
    }
}