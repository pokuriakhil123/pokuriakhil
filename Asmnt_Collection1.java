import java.util.*;
class Asmnt_Collection1{
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap();
        boolean val=true;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter Emp Code ");
            Integer ecode=Integer.parseInt(sc.nextLine());
             System.out.print("Enter Emp Name ");
             String ename=sc.nextLine();
             
             String edata=hm.put(ecode,ename);
             if(edata!=null){
             System.out.println("Empcode"+ecode+"is"+edata+"and has over written by"+ename);
        
             }
             System.out.println("Enter Another Student (Y/N)?");
             String choice=sc.nextLine();
             if(choice.equals("y")){
                 continue;
             }
             else{
                 break;
             }
        }
        while(val);
        System.out.println("Employee Names");
        for(int emp:hm.keySet()){
            
            System.out.println(hm.get(emp));
        }
    }
}