import java.util.Scanner;
class Numb4
{
     public static void main(String args[]) 
     {
        int count=0;
        long a;
        long numb;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter phone number (10 digits)");
        numb = sc.nextLong();
        long temp = numb;
        while(numb!=0)
        {
            numb=numb/10;
            count++;
        }
        a=temp%10000;
        if(count==10)
        {
            System.out.println("Mobile number ends with ******"+ a);
        }
        else
        {
            System.out.println("invalid number"); 
        }

     }
}