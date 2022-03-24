import java.util.*;
public class FinalException{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int ab[]={1,3,4};
        try {
            System.out.println((a/b));
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally
        {
              System.out.println("should be executed");
        }
          System.out.println("without handle");
    }
}
