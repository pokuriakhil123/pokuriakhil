//you accept numbers characters you have seperately
import java.util.*;
public class Rev_Char
{
public static void main(String[] args) {
String name=new String();
Scanner sc=new Scanner(System.in);
System.out.println("enter student details");
name=sc.nextLine();
String rev="";
for(int i=name.length()-1;i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.println(rev);
}


}