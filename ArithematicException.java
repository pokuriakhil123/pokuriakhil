import java.util.*;
class ArithematicException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number :");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number:");
        int num2=sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): \n");
        char operator = sc.next().charAt(0);
        int result;
        switch(operator){
            case '+':
                result=num1+num2;
                System.out.print("Addition is:"+result);
          break;
             case '-':
                result=num1-num2;
                System.out.print("Subtraction is:"+result);
                break;
             case '*':
                result=num1*num2;
                System.out.print("Multiplication is:"+result);
                break;
             case '/':
                 try{
                result=num1/num2;
                System.out.print("Devision is:"+result);
                break;}
                catch(Exception e){
                    System.out.println(e);
                }
            default:
            System.out.printf("Error! Operator is not correct");
                
                
        }

 

        
        
    }
}