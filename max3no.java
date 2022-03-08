import java.util.Scanner;
class max3no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter value of a=");
        a=sc.nextInt();
        System.out.println("enter value of b=");
        b=sc.nextInt();
        System.out.println("enter value of c=");
        c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("a is greater");
        }
        else if(b>c&&b>a)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
}