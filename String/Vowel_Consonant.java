//To print Vowels and Consonants in a String: 
import java.util.*;
class Vowel_Consonant
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();
        s=s.toLowerCase();
        System.out.println("Vowels are:");
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
            {
                System.out.print(" "+s.charAt(i));
            }
        }
        System.out.println("\n Consonants are:");
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u') 
            {
                System.out.print(" "+s.charAt(i));
            }
        }

 

    }
}