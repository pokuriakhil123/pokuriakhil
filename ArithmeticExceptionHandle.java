public class ArithmeticExceptionHandle{
    public static void main(String[]args){
        try{
            int data=50/0;
        }
        //handling exception
        catch(Exception e)
        {
             System.out.println(e);
        }
         System.out.println("rest of code");
    }
}