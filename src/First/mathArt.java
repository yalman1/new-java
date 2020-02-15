package First;
import java.util.Scanner;
public class mathArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("math or art");
        String lesson = scan.next();

        if (lesson.equalsIgnoreCase("math")) {
            System.out.println("tutor ? (y/n");
            String tutor = scan.next();
            if (tutor.equals("y")) {
                System.out.println("ok");
            }
            else if (tutor.equals("n")) {
            System.out.println("study yourself");
        }
            else {
            System.out.println("study yourself");
        }
    }
        else if(lesson.equalsIgnoreCase("art")){
            System.out.println("nice choice");
        }
    }


}