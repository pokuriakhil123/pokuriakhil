import java.util.*;
public class ArraySize{
    public static void main(String[]args){
        ArrayList stu=new ArrayList();
        stu.add("1234");
        stu.add("Durga");
        stu.add("mech");
        stu.add("9182870702");
        stu.add(35.7);
       System.out.println("Student Details");
       System.out.println(stu.size());
        for(int i=0;i<stu.size();i++)
        {
            System.out.println(stu.get(i));
        }
    }
}