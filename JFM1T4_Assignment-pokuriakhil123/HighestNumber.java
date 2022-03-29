/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
/*import java.util.scanner;

public class HighestNumber {
*/     
//Add main method

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 
//}

import java.util.Scanner;
class HighestNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first number=");
        a=sc.nextInt();
        System.out.println("enter second number=");
        b=sc.nextInt();
        System.out.println("enter third number=");
        c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("first number is greater");
        }
        else if(b>c&&b>a)
        {
            System.out.println("second number is greater");
        }
        else
        {
            System.out.println("third number is greater");
        }
    }
}