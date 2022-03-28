//Write a JAVAprogram to find total number of alphabets,digits or special character in a string.
import java.util.*;
class String_Count_ads
{
    public static void main(String[] args){
        int i,alphabets,digits,spl;
        alphabets=digits=spl=0;
        char ch;
       // String name=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String name=sc.nextLine();
        for(i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
            {
                alphabets++;
            }
            else if(ch>='0'&&ch<='9')
            {
                digits++;
            }
            else {
                spl++;
            }
           
        }
        System.out.println("Number of Alphabates in given string:"+alphabets);
        System.out.println("Number of digits in given string:"+digits);
        System.out.println("Number of Special Characters in given string:"+spl);
    }
   
   
}