class Employee
{
int empid;
String name;
int salary;
String DOB;
double HRA()
{
double hra=(salary*20)/100;
return hra;
}
}
class Manager extends Employee
{
double DA()
{
double da=(salary*10)/100;
return da;
}
}

class inh2_employee
{
public static void main(String args[])
{
Manager lalitha=new Manager();
lalitha.salary=20000;
System.out.println(lalitha.salary);
double hr=lalitha.HRA();
System.out.println(hr);
double d=lalitha.DA();
System.out.println(d);
double grosssalary=lalitha.salary+d+hr;
System.out.println(grosssalary);
}
}

