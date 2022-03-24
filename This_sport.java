import java.util.*;
public class This_sport 
{
   private String sport;
   public String getSport() 
   {
      return sport;
   }
   public void setSport(String sport) 
   {
      this.sport = sport;
   }
   public void display() 
   {
      System.out.println("sport: "+this.getSport());
   }
   public static void main(String args[]) 
   {
      This_sport obj = new This_sport();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sport name : ");
      String sport = sc.nextLine();
      obj.setSport(sport);
      obj.display();
   }
}