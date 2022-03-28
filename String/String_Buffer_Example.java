import java.util.*;
class String_Buffer_Example
{
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("Akhil");
        //str.append("Pokuri");
        str.insert(0,"Pokuri");
        System.out.println(str);
        System.out.println(str.reverse());
        
    }
}