package switchStatement;
import java.util.Scanner;
public class monthNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner (System.in);
        System.out.println("please enter month number 1-12");
        int month =myScan.nextInt();
        String monthText="null";
        switch (month) {
            case 1:
                monthText = "January";
                break;

            case 2:
                monthText = "February";
                break;

            case 3:
                monthText = "March";
                break;
            case 4:
                monthText = "April";
                break;
            case 5:
                monthText = "May";
                break;
            case 6:
                monthText = "Jun";
                break;
            case 7:
                monthText = "July";
                break;
            case 8:
                monthText = "August";
                break;
            case 9:
                monthText = "September";
                break;
            case 10:
                monthText = "October";
                break;
            case 11:
                monthText = "November";
                break;
            case 12:
                monthText = "December";
                break;
            default:
                System.out.println("only 1-12");
                break;

        }
        if (!monthText.equals("x"))
        System.out.println(monthText);
    }
}
