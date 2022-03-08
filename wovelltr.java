import java.util.Scanner;
class wovelltr
{
    public static void main(String args[])
    {
        System.out.println("Enter ltr=");
        Scanner sc= new Scanner(System.in);
        char ltr=sc.next().charAt(0);
        if((ltr=='a'||ltr=='e'||ltr=='i'||ltr=='o'||ltr=='u') || (ltr=='A'||ltr=='E'||ltr=='I'||ltr=='O'||ltr=='U')) 
        {
            System.out.println(" vowel");
        }
        else
        {
             System.out.println(" consonant");
        }
    }
}