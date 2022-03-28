import java.util.*;
public class ArrayStu_dts {
    public static void main(String[]args)
    {
        ArrayList<String>stu=new ArrayList();
        stu.add("1234");
        stu.add("Durga");
        stu.add("mech");
        stu.add("9182870702");
        stu.add("76.5");
        System.out.println("Student details");
        for(String s:stu)
        {
            System.out.println(s);
        }
    }
}