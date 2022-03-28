import java.util.*;
public class SetClearMethod
{
    public static void main(String[]args)
    {
        Set<Integer>data=new LinkedHashSet<Integer>();
        data.add(65);
        data.add(78);
        data.add(69);
        data.add(45);
        System.out.println("Set:"+data);
        data.clear();
        System.out.println("The final set:"+data);
    }
}