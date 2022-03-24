import java.util.*;
public class temp_array
{
    public static void main(String args[])
    {
        int i,n;
        double min;
        double a[]=new double[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of days ");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println("the temperature of "+i+" day is ");
            a[i]=sc.nextDouble();
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("lowest temperature is "+min);
    }
}