import java.util.*;
public class array2D_prob2
{
    public static void main(String args[])
    {
        int i,j,count=0;
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
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               if(a[i][j]!=20 && a[i][j]<10)
               {
               count++;
               break;    
               }
           }
       }
       System.out.println(count+" values are there");
    }
}