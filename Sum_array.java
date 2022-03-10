import java.util.*;
public class Sum_array
{
    public static void main(String args[])
    {
        int i,sum=0;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum of array elements "+sum);
    }
}