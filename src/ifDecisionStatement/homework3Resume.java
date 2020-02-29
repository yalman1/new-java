package ifDecisionStatement;

import java.util.Scanner;
public class homework3Resume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your java possible value. entry-junior-senior");
        String java=scan.next();
        System.out.println ("Enter your SQL possible value");
        int sql = scan.nextInt();
        System.out.println("Enter your Experience possible value");
        int experience =scan.nextInt();

        int score;
        if (java.equalsIgnoreCase("entry")){
            score=((500+sql)*experience);
        }
        else if (java.equalsIgnoreCase("junior")){
            score =((1000+sql)*experience);
        }
        else {
            score=((2000+sql)*experience);
        }
        if (score>=10000){
            System.out.println("your offer is $80.000  ");
        }
        else if (score>7000&& score<10000){
            System.out.println("your offer is $60.000 ");
        }
        else if (score>5000 && score <7000){
            System.out.println("your offer is $40.000");
        }
        else {
            System.out.println("we will keep your resume");
        }
    }

}
