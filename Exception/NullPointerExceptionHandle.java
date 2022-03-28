import java.util.*;
public class NullPointeExceptionHandle{
    static int value=60;
    public static void main(String[]args)
    {
       if(s==null)
       {
           throw new ArgumentException("Arguments can not be null");
       }
       return value;
    }
    public static void main(Strin[]args){
        String s=null;
        try{
            System.out.println(getValue(s));
        }
        catch(ArgumentException ex){
            System.out.println("ArgumentException caught");
        }
        s="JTP";
        try{
            System.out.println(getValue(s));
        }
        catch(Exception ex){
            System.out.println("ArithmeticException caught");
        }
    }
}