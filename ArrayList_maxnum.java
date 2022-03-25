import java.util.*;
public class ArrayList_maxnum {
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList();
        arr.add(78);
        arr.add(45);
        arr.add(54);
        arr.add(65);
        arr.add(10);
        arr.add(76);
        arr.add(87);
        arr.add(79);
        arr.add(6);
        arr.add(7);
        int max = arr.get(0);
        int n =arr.size();
        for (int i=1;i<n;i++){
            if(arr.get(i)>max){
                max =arr.get(i);
            }
        }
        System.out.println("maximum is:"+max);
    }
}