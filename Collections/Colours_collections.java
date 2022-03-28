import java.util.*;
class Colours_collections
{
    public static void main(String args[])
    {
        ArrayList<String> Element=new ArrayList();
        Element.add("Red");
        Element.add("Green");
        Element.add("Orenge");
        Element.add("White");
        Element.add("Black");
        for(String e:Element)
        {
            if(e.equals("Red"))
            {
                System.out.println("Red Element is Present");
            }
        }
    }
}