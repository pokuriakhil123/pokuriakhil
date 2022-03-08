import java.util.Scanner;
class signnumb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter value of i=");
        i=sc.nextInt();
        if(i>0)
        {
            System.out.println("i is positive");
        }
        else if(i<0)
        {
            System.out.println("i is negative");
        }
        else 
        {
            System.out.println("i is equal to zero");
        }
    }
}