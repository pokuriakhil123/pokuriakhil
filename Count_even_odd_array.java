import java.util.*;
public class Count_even_odd_array
{
    public static void main(String args[])
    {
        int i,ceven=0,codd=0;
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
                ceven++;
                
            }
            else
            {
                System.out.println("odd number "+a[i]);
                codd++;
                
            }
            
        }
        System.out.println("total even"+ceven);
        System.out.println("total odd"+codd);
    }
}