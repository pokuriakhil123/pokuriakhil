import java.util.*;
public class array1
{
    public static void main(String args[])
    {
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array elemnts are ");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}