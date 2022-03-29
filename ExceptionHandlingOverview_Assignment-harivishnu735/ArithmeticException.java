/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/

public class ArithmeticException {
    int num1,num2;
    //creating Constructor
    ArithmeticException(int n1,int n2){
         num1=n1;
        num2=n2;
      
    }
//main method
    public static void main(String args[]) {
        //Arithematic Exception will occur in when the num is divided by zero 
       ArithmeticException ae=new ArithmeticException(4,0);
        System.out.println(ae);
    }
}