class Sum
{
    static void sum(int a)
    {
        int sum=0;
        for (int i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
class SumNumb_Oops
{
    public static void main(String args[])
    {
        Sum.sum(5);
    }
}
