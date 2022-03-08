import java.util.Scanner;
class div5and2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numb;
        System.out.println("enter number=");
        numb=sc.nextInt();
        if(numb%5==0&&numb%11==0)
        {
            System.out.println("it is divisible for both 5 & 11");
        }
        else
        {
            System.out.println("it is not divisible for both 5 & 11");
        }
        
    }
}