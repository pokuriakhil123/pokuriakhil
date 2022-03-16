import java.util.Scanner;
class bank
{
    String name;
    String acc_type;
    double acc_no;
    Scanner sc = new Scanner(System.in);
    void input1()
    {
        
        System.out.println("Enter name ");
        name= sc.next();
        System.out.println("Enter account type ");
        acc_type= sc.next();
        System.out.println("Enter account number ");
        acc_no= sc.nextDouble();
        
    }
    void display1()
    {
        System.out.println("Name : "+name+"\naccount type : "+acc_type+"\naccount number : "+acc_no);
    }
}
class currentacc extends bank
{
    int balance, deposit, withdraw;
    void input2()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance ");
        balance= sc.nextInt();
        System.out.println("Enter deposit ");
        deposit= sc.nextInt();
        System.out.println("Enter withdraw ");
        withdraw= sc.nextInt();
    
    }
    
    void deposit()
    {
        balance=balance+deposit;
        System.out.println(balance);
    }
    void withdraw()
    {
        if(withdraw>balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance=balance-withdraw;
            System.out.println("balance after withdrawn is "+balance);
        }
    }
    void display2()
    {
        System.out.println("balance : "+balance+"\ndeposit : "+deposit+"\nwithdraw : "+withdraw);
    }
}
class inh_bank
{
    public static void main(String args[])
    {
        currentacc ca = new currentacc();
        ca.input1();
        ca.display1();
        ca.input2();
        ca.deposit();
        ca.withdraw();
        ca.display2();
    }
}