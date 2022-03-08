import java.util.Scanner;
class sum_fandl
{
    public static void main(String args[])
    {
        int i,count=0,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number=");
        int n=sc.nextInt();
        int lastdigit=n%10;
        int firstdigit=0;
        while(n>=9)
        {
            n=n/10;
        }
        firstdigit=n;
        System.out.println(firstdigit);
        System.out.println(lastdigit);
        s=firstdigit+lastdigit;
        System.out.println(s);
    }
}