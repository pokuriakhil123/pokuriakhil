import java.util.Scanner;
public class BooleanOperation {

//Define main method
public static void main (String args[])
{

//Declare a variable and initialize it as true or false 
Scanner sc=new Scanner(System.in);
boolean a;
System.out.println("Enter boolean value");

a=sc.nextBoolean();
if(a==false)
{

System.out.println("Output=true");
}
else
{
System.out.println("Output=false");
}
//Print the Result using not operator 

}
    
}