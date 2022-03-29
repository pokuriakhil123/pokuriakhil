/* 2. Write a program which will illustrate NumberFormatException. Create a test method,
with in the test method accept two numbers  using next() method of scanner class. 
Convert into numerical values and print addition of two numbers. Please write your comments 
regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
//import package
import java.util.*;
public class NumberFormatException {
//create test() method
  void test(){
      //take input from user
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter num1");
      String num1=sc.next();
      System.out.println("Enter num2");
      String num2=sc.next();
     //add the num1+num2;
      int num=num1+num2;//String cannot converted to int so here the NumberFormatException will Occur 
    //print the num
    System.out.println(num);
  }
// define main method
    public static void main(String args[]) {
    //create object for class    
    NumberFormatException ne=new NumberFormatException();
    //call the test() method with object reference
    ne.test();
    }
}
