import java.util.Scanner;
class prod_of_numb 
{
  public static void main(String[] args) 
  {
   int i,m,n,o;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st number = ");
     m=sc.nextInt();
  //  System.out.println("enter 2nd number = ");
   // n=sc.nextInt();
   
for(n=1;n<=10;n++){
    i=m*n;
   System.out.println("Product of the numbers: " +i);
   }
  }
}