/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
class Student{
// declare name marks variables
String name;
int marks;
String city;
// generate getter and setter methods
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setMarks(int marks){
this.marks=marks;
}
public int getMarks(){
return marks;
}
public void setCity(String city){
 this.city=city; 
}
public String getCity(){
  return city;
}
}
//define main method
public class NullPointerException {

// create a method called getStudentData(Student std)
public void getStudentData(Student std){
// print name, marks and city
System.out.println("Name : "+std.getName().toUpperCase()); //JVM throws NullpointerException if name is null
System.out.println("Marks : "+std.getMarks());
System.out.println("City :"+std.getCity());
}
public static void main(String args[]) {
// create object for Student class and NullPointerException class
Student s=new Student();
NullPointerException obj=new NullPointerException();
// call getStudentData(s) with object
obj.getStudentData(s); 
}
}
