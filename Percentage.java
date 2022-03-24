import java.util.Scanner;

public class Percentage 
{
  public static void main(String args[])
{
   float total_marks, maximum_marks; 
   float percentage;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the total marks");
   total_marks= scanner.nextFloat();
   System.out.println("Enter maximum marks possible "); 
   maximum_marks=scanner.nextFloat();
   percentage=(total_marks/maximum_marks)*100;
   System.out.println("percentage is " + percentage);
   
}
