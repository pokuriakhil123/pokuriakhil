import java.util.Scanner;
class Employee{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    Employee(int eid,String ename,String edept,int esal,String eaddr)
    {
        this.eid=eid;
        this.ename=ename;
        this.edept=edept;
        this.esal=esal;
        this.eaddr=eaddr;
    }
    void totalSal()
    {
        int grosssal=0,HRA=0,DA=0;
        if (esal>=10000 && esal<=20000){
            HRA=(esal*20)/100;
            DA=(esal*45)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else if (esal>20000 && esal<=40000){
            HRA=(esal*25)/100;
            DA=(esal*20)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else {
            HRA=(esal*30)/100;
            DA=(esal*30)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
    }
    Employee()
    {
       
    }
    Employee(int id)
    {
        this.eid=eid;
    }
    void display()
    {
        System.out.println(eid+"\n "+ename+"\n "+edept+"\n "+eaddr+"\n "+esal);
    }
    void working()
    {
      System.out.println(ename+" Is Working ");
    }
}
class Employee_1
{
    public static void main(String args[])
    {
        Employee emp1= new Employee(2468,"Meera","mechanical",28000,"Nellor");
      
        System.out.println("*****Employee 1 Details *****");
        emp1.display();
        emp1.totalSal();
        emp1.working();
       
        Employee emp2= new Employee(4807,"akhil","software",36000,"chennai");
       
        System.out.println("*****Employee 2 Details *****");
        emp2.display();
        emp2.totalSal();
        emp2.working();
        
        Employee emp3 = new Employee(6248,"Hari","Mech",15000,"Eluru");
        System.out.println("*****Employee 3 Details *****");
        emp3.display();
        emp3.totalSal();
        emp3.working();
        
        Employee emp4 = new Employee(2458,"Vishnu","Civil",30000,"Banglore");
        System.out.println("*****Employee 4 Details *****");
        emp4.display();
        emp4.totalSal();
        emp4.working();

    }
}