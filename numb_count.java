import java.util.Scanner;
class numb_count
{
    public static void main(String args[])
    {
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n= sc.nextInt();
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}