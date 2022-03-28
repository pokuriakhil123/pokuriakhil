import java.util.*;
public class ExceptionHandlingString{
    public static void main(String[]args)
    {
        String s="Durga";
        System.out.println(s.length());
      try {
          System.out.println(s.charAt(6));
       }
       catch(Exception p)
       {
           System.out.println(p);
       }
       System.out.println("BitLabs");
    }
}