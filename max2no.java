import java.util.Scanner;
class max2no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter value of a=");
        a=sc.nextInt();
        System.out.println("enter value of b=");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else
        {
            System.out.println("b is greater");
            
        }
    }
}