import java.util.*;
public class Neg_numb_array
{
    public static void main(String args[])
    {
        int neg,i;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]<0)
            {
                neg=a[i];
                System.out.println("negative number "+neg);
            }
        }
    }
}