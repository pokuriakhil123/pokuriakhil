
import java.util.Scanner;
class scan1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rollno;
        long phoneno;
        String name, branch, address;
        char section;
        System.out.println("enter name=");
        name=sc.nextLine();
        System.out.println("enter rollno=");
        rollno=sc.nextInt();
        System.out.println("enter branch=");
        branch=sc.next();
        System.out.println("enter Section=");
        section=sc.next().charAt(0);
        System.out.println("enter phoneno=");
        phoneno=sc.nextLong();
        System.out.println("enter address=");
        address=sc.next();
}
}