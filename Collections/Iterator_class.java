import java.util.*;
public class Iterator_class{
    public static void main(String[]args){
        ArrayList<String>stu=new ArrayList();
        stu.add("1234");
        stu.add("Durga");
        stu.add("mech");
        stu.add("9182870702");
        stu.add("78.8");
        stu.add("Durga");
        System.out.println("Student detalis");
        Iterator itr=stu.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}