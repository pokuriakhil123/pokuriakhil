import java.util.*;
class BankAccount
{
    long account_number;
    double account_balance;
    void setAccount_number(long account_number)
    {
        this.account_number=account_number;
    }
    void setAccount_balance(double account_balance)
    {
        this.account_balance=account_balance;
    }
    long getAccount_number()
    {
        return this.account_number;
    }
    double getAccount_balance()
    {
        return this.account_balance;
    }
}
class Bank_hacker
{
    public static void main(String args[])
    {
        BankAccount b=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number : ");
        long acc_numb=sc.nextLong();
        b.setAccount_number(acc_numb);
        System.out.println("enter account balance : ");
        double acc_bal=sc.nextDouble();
        b.setAccount_balance(acc_bal);
        
        System.out.println(b.getAccount_number());
        System.out.println(b.getAccount_balance());
    }
}