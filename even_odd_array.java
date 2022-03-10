import java.util.*;
public class even_odd_array
{
    public static void main(String args[])
    {
        int i;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("even number "+a[i]);
            }
            else
            {
                System.out.println("odd number "+a[i]);
            }
        }
    }
}