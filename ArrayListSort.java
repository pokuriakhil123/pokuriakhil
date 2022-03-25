import java.util.*;
public class ArrayListSort
{
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("ArrayList Before Sorting:");
        for(int marks:list)
        {
            System.out.println(marks);
            Collections.sort(list,Collections.reverseOrder());
            System.out.println("ArrayList after Sorting:");
            for(int marks:list)
            {
                System.out.println(marks);
            }
        }
      
    }
}