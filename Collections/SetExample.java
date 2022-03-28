import java.util.*;
public class SetExample
{
    public static void main(String[]args)
    {
        Set<Integer>data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(54);
        data.add(67);
        data.add(87);
        data.add(43);
        System.out.println("data:"+data);
    }
}