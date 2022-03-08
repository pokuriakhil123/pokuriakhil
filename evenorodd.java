import java.util.Scanner;
class evenorodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numb;
        System.out.println("enter number=");
        numb=sc.nextInt();
        if(numb%2==0)
        {
            System.out.println("it is an even number");
        }
        else
        {
            System.out.println("it is an odd number");
        }
        
    }
}