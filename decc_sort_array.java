import java.util.*;
public class decc_sort_array
{
    public static void main(String args[])
    {
        int n,max;
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
        //sorting
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }    
            }
        }
        System.out.println("sorted array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}