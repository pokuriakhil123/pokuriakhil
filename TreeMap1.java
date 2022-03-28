import java.util.*;
class TreeMap1
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> map= new TreeMap();
        map.put(3,"cat");
        map.put(4,"dog");
        map.put(1,"apple");
        map.put(4,"pan");
        map.put(2,"bannana");
        map.put(5,"elephant");
        map.put(6,"fan");
        map.put(7,"fan");
        System.out.println(map.get(2));
        //lst.add(null);
        for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map);
    }
}