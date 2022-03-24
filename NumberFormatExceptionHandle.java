public class NumberFormatExceptionHandle
{
    private static final String inputString="123.33";
    public static void main(String[]args)
    {
        try{
            int a = Integer.parseInt(inputString);
        }
        catch(Exception e)
        {
            System.out.println("invalid string in argument");
        }
    }
}