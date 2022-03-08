import java.util.Scanner;
class mark_per
{
    public static void main(String args[])
    {
        int phys,chem,bio,math,comp,tot,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter physics marks=");
        phys=sc.nextInt();
        System.out.println("enter chemistry marks=");
        chem=sc.nextInt();
        System.out.println("enter biology marks=");
        bio=sc.nextInt();
        System.out.println("enter mathematics marks=");
        math=sc.nextInt();
        System.out.println("enter computer marks=");
        comp=sc.nextInt();
        tot=phys+chem+bio+math+comp;
        avg=tot/5;
        System.out.println("total marks= " + tot);
        System.out.println("average percentage= " + avg);
        if(avg>=90)
        {
            System.out.println("Grade A");
        }
        else if(avg<90||avg>=80)
        {
            System.out.println("Grade B");
        }
        else if(avg<80||avg>=70)
        {
            System.out.println("Grade C");
        }
        else if(avg<70||avg>=60)
        {
            System.out.println("Grade D");
        }
        else if(avg<60||avg>=50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}