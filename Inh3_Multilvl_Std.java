class Student
{
    int sid;
    String sname;
    String section;
    String address;
}
class Exam extends Student
{
    float internal_marks;
    float external_marks;
}
class Project extends Exam
{
    float project_marks;
}
class Inh3_Multilvl_Std 
{
    public static void main(String args[])
    {
        Project result=new Project();
        result.sid=4807;
        result.sname="Akhil";
        result.section="A";
        result.address="VIJAYAWADA";
        System.out.println("ID: "+result.sid+"\nNAME: "+result.sname+"\nSECTION: "+result.section+"\nADDRESS: "+result.address);
        result.internal_marks=99;
        result.external_marks=88;
        result.project_marks=88;
        float total_marks=(result.internal_marks+result.external_marks+result.project_marks);
        System.out.println(total_marks);
        float max_marks=300;
        float percentage=(total_marks/max_marks)*100;
        System.out.println(percentage);
          if (percentage>=90 && percentage<=100)
            {
        System.out.println("Grade A");
        }
        else if (percentage>=80 && percentage<=90)
       
        {
            System.out.println("Grade B");
        }
        else if (percentage>=70 && percentage<=80)
        {
            System.out.println("Grade C");
        }
        else if (percentage>=60 && percentage<=70)
        {
        System.out.println("Grade D");
        }
       else if (percentage>=50 && percentage<=60)
        {
        System.out.println("Grade E");
        }
        else  if (percentage>=40 && percentage<=50)
        {
           
        System.out.println("Grade f");
        }
        else
        {
             System.out.println("Fail");
        }
    }
}
