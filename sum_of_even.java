import java.util.Scanner;
class sum_of_even 
{
  public static void main(String[] args) 
  {
    int i,sum=0,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number = ");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    if(i%2==0)
    {
        sum=i+sum;
    }System.out.println(sum);
  }
}