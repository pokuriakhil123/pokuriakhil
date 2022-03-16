import java.util.Scanner;
class Employee
{
    String ename;
    int eid;
    String edepart;
    double esalary;
    String eadress;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ename ");
        ename= sc.next();
        System.out.println("Enter eid ");
        eid= sc.nextInt();
        System.out.println("Enter edepart ");
        edepart= sc.next();
        System.out.println("Enter esalary ");
        esalary= sc.nextDouble();
        System.out.println("Enter eadress ");
        eadress= sc.next();
    }
    void display()
    {
        System.out.println(ename+"\n"+eid+"\n"+edepart+"\n"+esalary+"\n"+eadress);
    }
    void totalsalary()
    {
     double grosssalary=0;
     double hra=0;
     double da=0;
     if(esalary>=10000&&esalary<=20000){
         hra=(esalary*20)/100;
         da=(esalary*45)/100;
         grosssalary=esalary+hra+da;
         System.out.println("The Gross Salary is greater than 10000 &Less than 20000 is :"+grosssalary);
         
     } 
     else if(esalary>20000&&esalary<=40000){
         hra=(esalary*25)/100;
         da=(esalary*20)/100;
         grosssalary=esalary+hra+da;
         System.out.println("The Gross Salary is  greater  than 20000 &Less than 40000 is :"+grosssalary);
        
     } 
     else{
         hra=(esalary*30)/100;
         da=(esalary*30)/100;
         grosssalary=esalary+hra+da;
         System.out.println("The Gross Salary is :"+grosssalary);
     }
    }
   
}
class Grosssalary_sc
{
    public static void main(String args[]){
    Employee emp1 = new Employee();
    emp1.input();
    System.out.println("***Employee 1 Details**");  
    emp1.display();
    emp1.totalsalary();
    
    Employee emp2 = new Employee();
    emp2.input();
    System.out.println("***Employee 2 Details**");  
    emp2.display();
    emp2.totalsalary();
        
    }
}