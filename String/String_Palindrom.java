import java.util.*;
public class Palindrome {
   //main method
    public static void main(String args[])
   {
      //declare varible
      String str, rev = "";
      //take input from user
      Scanner sc = new Scanner(System.in);
      //print enter a string
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
      //using for loop
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      //if condition
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }

}