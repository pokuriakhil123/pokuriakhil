import java.util.*;
class String_Builder_Example
{
    public static void main(String args[])
    {
        StringBuilder str=new StringBuilder("Akhil");
        //str.append("Pokuri");
        str.insert(0,"Pokuri");
        System.out.println(str);
        System.out.println(str.reverse());
    }
}