class student
{
    String sname;
    int srollno;
    String ssec;
    int sinternal_marks;
    int sexternal_marks;
    int sproject_marks;
   
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
class Student_Marks
{
    public static void main(String args[])
    {
    student std1 = new student();
    std1.sname="Hari";
    std1.srollno=123;
    std1.ssec= " A ";
    std1.sinternal_marks= 72;
    std1.sexternal_marks= 88;
    std1.sproject_marks= 94;
    System.out.println("all details along with the grade are ");
    System.out.println("Name :"+std1.sname+"\n"+"Roll no :"+std1.srollno+"\n"+"Section :"+std1.ssec+"\n"+"internal marks :"+std1.sinternal_marks+"\n"+"external marks :"+std1.sexternal_marks+"\n"+"project marks :"+std1.sproject_marks);
    std1.grade();
    
    student std2 = new student();
    std2.sname="Srinu";
    std2.srollno=256;
    std2.ssec= " B ";
    std2.sinternal_marks= 67;
    std2.sexternal_marks= 75;
    std2.sproject_marks= 96;
    System.out.println("all details along with the grade are ");
    System.out.println("Name :"+std2.sname+"\n"+"Roll no :"+std2.srollno+"\n"+"Section :"+std2.ssec+"\n"+"internal marks :"+std2.sinternal_marks+"\n"+"external marks :"+std2.sexternal_marks+"\n"+"project marks :"+std2.sproject_marks);
    std2.grade();
    }
}
