import java.util.Scanner;
class leapyear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("enter number=");
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("it is an leap year");
        }
        else
        {
            System.out.println("it is not an leap year");
        }
        
    }
}