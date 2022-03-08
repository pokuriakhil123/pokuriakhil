import java.util.Scanner;
class sum_of_numb 
{
  public static void main(String[] args) 
  {
    int i,sum=0,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number = ");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        sum=i+sum;
    }System.out.println(sum);
  }
}