import java.util.*;
class ElectricitybillException 
{
    public static void main(String[]args)
    {
        int u,amt=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the units:");
        u=sc.nextInt();
        if(u<=100)
        {
            amt=u*5;
            System.out.println("Enter amount"+amt);
        }
       else if(u>=101 && u<=200)
        {
            amt=100*5+(u-100)*7;
            System.out.println("Bill amount="+amt);
        }
        else if(u>=201 && u<=300)
        {
            amt=100*5+200*7+(u-200)*10;
            System.out.println("Bill amount="+amt);
        }
        else
        {
            amt=100*5+200*7+300*10+(u-300)*15;
            System.out.println("Bill amount="+amt);
        }
    }
}