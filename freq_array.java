import java.util.*;
public class freq_array
{
    public static void main(String args[])
    {
        int n,num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        //reading elements from user
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to find freq");
        num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                count=count+1;
            }
        }
        System.out.println("frequency:"+count);
        if(count==0)
        {
            System.out.println("Element not found");
        }
    }
}