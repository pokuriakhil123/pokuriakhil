import java.util.*;
class Employee
{
    int empid;
    String name;
    int salary;
    Employee(int e,String n,int s)
    {
        empid=e;
        name=n;
        salary=s;
    }
}
class ArrayListEmploye
{
    public static void main(String args[])
    {
        ArrayList<Employee> emp=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int empid;
        String name;
        int salary;
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter empid");
            empid=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter salary");
            salary=sc.nextInt();
            emp.add(new Employee(empid,name,salary));
        }
        for(Employee em:emp)
        {
            System.out.println(em.empid+" "+em.name+" "+em.salary);
        }
    }
}