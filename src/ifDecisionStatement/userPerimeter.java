package ifDecisionStatement;
import java.util.Scanner;
public class userPerimeter {
    public static void main(String[] args) {
        //creating scanner object to read from keyboard
        Scanner myScan = new Scanner (System.in);
        System.out.println("please enter C, R, T:");
        //receiveing answer from the user
        String shape =myScan.next();


        if (shape.compareToIgnoreCase("c")==0){ //for the circle
            //ask radius from user
            System.out.println("please enter the radius");
            double radius = myScan.nextDouble();
            System.out.println(2*3.14*radius);
        }
        else if (shape.compareToIgnoreCase("r")==0) {
            //as width and height from user
            System.out.println("enter width:");
            int width =myScan.nextInt();
            System.out.println("enter height:");
            int height =myScan.nextInt();
            System.out.println(2*(width+height));

        }
        else if (shape.compareToIgnoreCase("t")==0) {
            //ask edges from user
            System.out.println("please enter edges1:");
            int edge1 = myScan.nextInt();
            System.out.println("please enter edges2:");
            int edge2 = myScan.nextInt();
            System.out.println("please enter edges3:");
            int edge3 = myScan.nextInt();
            System.out.println(edge1+edge2+edge3);

        }

        else{
            System.out.println("please C, R, T");
        }
    }
}
