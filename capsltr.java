import java.util.Scanner;
class capsltr
{
    public static void main(String args[])
    {
        
        System.out.println("Enter data=");
        Scanner sc= new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if(alpha >= 'a' && alpha <= 'z') 
        {
            System.out.println(alpha+ " is lower case Alphabet");
        }
        else
        {
             System.out.println(alpha+ "  is upper case Alphabet");
        }
    }
}