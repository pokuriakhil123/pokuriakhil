import java.util.*;
public class max_array_10
{
    public static void main(String args[])
    {
        int i;
        float max;
        float a[]=new float[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextFloat();
        }
        max=a[0];
        for(i=0;i<10;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            
        }System.out.println("max number "+max);
    }
}