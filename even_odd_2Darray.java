import java.util.*;
public class even_odd_2Darray
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row & colums value ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        //reading from user
        System.out.println("enter array elements ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("even numbers ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]%2==0)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("odd numbers ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]%2!=0)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}