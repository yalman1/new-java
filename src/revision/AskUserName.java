package revision;
import java.util.Scanner;
public class AskUserName {
    public static void main(String[] args) {
        String userName="user";
        String password="password";
        Scanner scan=new Scanner (System.in);
        System.out.println("enter username");
        String user=scan.next();
        System.out.println("enter password");
        String pass=scan.next();

        if (userName.equals(user)&&password.equals(pass)) {
            System.out.println("welcome to your page");
        }
        else {
            System.out.println("username or password is wrong");
        }
    }
}
