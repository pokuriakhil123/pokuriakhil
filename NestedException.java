import java.util.*;
public class NestedException
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
System.out.println("Enter b value");
int b=sc.nextInt();
int ab[]={1,3,4};
try{
   System.out.println("value division by"+(a/b));
   System.out.println("Executed block");
try {
 System.out.println(ab[6]=5);
}
catch(Exception e)
{
System.out.println(e);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
