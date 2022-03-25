import java.util.ArrayList;
public class ArrayListReverseElements
{
    public static void main(String[]args)
{
        ArrayList<Integer>Elements=new ArrayList();
        Elements.add(5);
        Elements.add(4);
        Elements.add(3);
        Elements.add(2);
        Elements.add(1);
        ArrayList<Integer>newElements = reverse(Elements);
        System.out.println(newElements);
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer>Elements)
    {
        ArrayList<Integer> result =new ArrayList<Integer>();
        for(int i=Elements.size()-1;i>=0;i--)
        {
            result.add(Elements.get(i));
        }
        return result;
    }
}