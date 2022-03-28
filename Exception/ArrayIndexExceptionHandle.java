import java.util.*;
public class ArrayIndexExceptionHandle
{
    public static void main(String[]args)
    {
       int[] myArray={1,2,3,4,5,7};
       System.out.println("Elements in the array::");
      //  System.out.println(myArray.String(myArray));
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the index of the required elements ::");
         try{
             int element=sc.nextInt();
              System.out.println("Elements in the given index is ::"+myArray);
         }
         catch(Exception e){
              System.out.println("The index you have entered is invalid");
               System.out.println("please enter an index number between 0 and 6");
         }
    }
}
