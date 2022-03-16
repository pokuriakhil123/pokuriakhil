class amstrong
{
    static void ams(int a)
    {
        int d,sum=0,temp;
        d=a;
        while(d!=0)
        {
            temp=d%10;
            sum=sum+temp*temp*temp;
            d=d/10;
        }
        if(sum==a)
        {
            System.out.println(a+" Amstrong");
        }
        else
        {
            System.out.println(a+" not an Amstrong");
        }
    }
}
class amstrong_oops
{
    public static void main(String args[])
    {
        amstrong.ams(5);
    }
}