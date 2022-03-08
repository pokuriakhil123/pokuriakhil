import java.util.Scanner;
class manynotes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int amount, note=0, remain=0;
        System.out.println("enter amount=");
        amount=sc.nextInt();
        if(amount>0)
        {
            note=amount/100;
            remain= amount%100;
        }
       System.out.println("the number of 100 notes are" +note);
       System.out.println("reamaining amount is" +remain);
        
    }
}