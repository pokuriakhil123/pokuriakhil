import java.util.Scanner;
class letter_or_not
{
    public static void main(String args[])
    {
        
        System.out.println("Enter data=");
        Scanner sc= new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z'))
        {
            System.out.println(alpha+ " is Alphabet");
        }
        else
        {
             System.out.println(alpha+ "  is not Alphabet");
        }
    }
}