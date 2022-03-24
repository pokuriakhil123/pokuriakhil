 import java.util.*;
class FirstnameString
{
    public static void main(String[]args)
    {
        int digit,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name");
        String fname=sc.next();
        System.out.println("Enter last name");
        String lname=sc.next();
        System.out.println("Enter mobile number");
        String mobilenum=sc.next();
        try {
            long num=Long.parseLong(lname);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("......");
        System.out.println("length of firstnameis:"+fname.length());
          System.out.println("length of lastnameis:"+lname.length());
           // System.out.println("length of firstnameis:"+fname.length());
        
        
    }
}