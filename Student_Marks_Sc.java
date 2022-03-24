import java.util.Scanner;
class student
{
    String sname;
    int srollno;
    String ssec;
    int sinternal_marks;
    int sexternal_marks;
    int sproject_marks;
   
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sname ");
        sname= sc.next();
        System.out.println("Enter srollno ");
        srollno= sc.nextInt();
        System.out.println("Enter ssec ");
        ssec= sc.next();
        System.out.println("Enter sinternal_marks ");
        sinternal_marks= sc.nextInt();
        System.out.println("Enter sextenal_marks ");
        sexternal_marks= sc.nextInt();
        System.out.println("Enter sproject_marks ");
        sproject_marks= sc.nextInt();
    }
    void display()
    {
        System.out.println(sname+"\n"+srollno+"\n"+ssec+"\n"+sinternal_marks+"\n"+sexternal_marks+"\n"+sproject_marks);
    }
    void grade()
    {
        float per;
        int total=sinternal_marks+sexternal_marks+sproject_marks;
        per=(total/300)*100;
        if(per<90 && per>=80)
        {
            System.out.println(sname+" is Grade A ");
        }
        else if(per<80 && per>=70)
        {
            System.out.println(sname+" is Grade B ");
        }
        else if(per<70 && per>=60)
        {
            System.out.println(sname+" is Grade C ");
        }
        else
        {
            System.out.println(sname+" is Failed ");
        }
        
    }
    
}
class Student_Marks_Sc
{
    public static void main(String args[])
    {
    student std1 = new student();
    std1.input();
    System.out.println("all details along with the grade are ");
    std1.display();
    std1.grade();
    
    student std2 = new student();
    std2.input();
    System.out.println("all details along with the grade are ");
    std2.display();
    std2.grade();
    }
}
