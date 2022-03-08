
import java.util.Scanner;
class Ifcase1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age, weight;
        System.out.println("enter age=");
        age=sc.nextInt();
        System.out.println("enter weight=");
        weight=sc.nextInt();
        if(age>=18&&weight>=50)
        {
            System.out.println("he is eligible for donating blood");
        }
        else
        {
            System.out.println("he is not eligible for donating blood");
        }
    }
}