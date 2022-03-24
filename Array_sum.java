import java.util.*; 
 
 
public class array_sum 
{ 
   
    public static void main(String[] args) 
    { 
      
        int i,sum=0; 
        int arr[]=new int[10]; 
         
        System.out.println("Enter 10 numbers"); 
         
        Scanner sc=new Scanner(System.in); 
         
        for(i=0;i<10;++i) 
             arr[i]=sc.nextInt(); 
         
        for(i=0;i<10;++i) 
            sum=sum+arr[i]; 
         
        System.out.println("Sum of numbers is:"+sum); 
    } 
     
} 