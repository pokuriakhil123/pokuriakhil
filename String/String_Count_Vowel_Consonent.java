/*
import java.util.*;
class String_Count_Vowel_Consonent
{
    public static void main(String args[])
    {
        int vowel_count=0; conso_count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        s=s.toLowerCase();
        System.out.println("Vowels are:");
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
            {
                System.out.print(" "+s.charAt(i));
                vowel_count++;
            }
        }
        System.out.println("Total number of Vowels are: "+vowel_count);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u')
            {
                System.out.print(" "+s.charAt(i));
                conso_count++;
            }
        }
        System.out.println("Total number of Consonents are: "+conso_count);
    }
}


*/
class String_Count_Vowel_Consonent
{
        public static void main(String[] args){
            int vowel_count=0,conso_count=0;
        String str=new String();
        str="Andhraloyolacollege";
        System.out.println("The vowel in string");
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
           {
               System.out.println(" "+str.charAt(i));
               vowel_count++;
           }
        }
        
        System.out.println("The Consonants in string");
         for(int i=0;i<str.length();i++) 
        {
            if(str.charAt(i)!='a'&& str.charAt(i)!='e'&& str.charAt(i)!='i'&& str.charAt(i)!='o'&& str.charAt(i)!='u') 
            {
                System.out.println(""+str.charAt(i));
                conso_count++;
            }
            
        }
        System.out.println("The No of Consonants in a String:"+conso_count);
        System.out.println("The No of vowels in a String:"+vowel_count);

 

    }
}