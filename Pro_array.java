import java.util.*;
public class Pro_array
{
    public static void main(String args[])
    {
        int i,pro=1;
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            pro=pro*a[i];
        }
        System.out.println("product of array elements "+pro);
    }
}