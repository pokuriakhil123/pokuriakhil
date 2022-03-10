import java.util.*;
public class max_min_array
{
    public static void main(String args[])
    {
        int i,max,min;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0;i<5;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            System.out.println("max number "+max);
        }
        min=a[0];
        for(i=0;i<5;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            System.out.println("min number "+min);
        }
    }
}