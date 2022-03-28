import java.util.*;
public class ArrayListCopyElements
{
    public static void main(String[]args)
    {
        ArrayList<Integer>Elements=new ArrayList();
        Elements.add(0);
        Elements.add(1);
        Elements.add(2);
        Elements.add(3);
        Elements.add(4);
        ArrayList<Integer>Elements1=new ArrayList();
        Elements1.add(4);
        Elements1.add(3);
        Elements1.add(2);
        Elements1.add(1);
        Elements1.add(0);
        System.out.println("\n Elements1 After copy :"+Elements1);
        Collections.copy(Elements,Elements1);
        System.out.println("\n Elements1 before copy :"+Elements1);
        
    }
}