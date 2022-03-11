import java.util.*;
class copy_array
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int a1[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            a1[i]=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        for(int i=0;i<a1.length;i++)
        {
            System.out.println("a1["+i+"]="+a1[i]);
        }
    }
}