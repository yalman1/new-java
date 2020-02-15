package First;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("the student grade is:");

        int average = myScan.nextInt();


        if (average < 49) {
            System.out.println("fail");
        }

        else if ((average >50) && (average <59)){

            System.out.println("D");

        }
        else if ((average >=60) && (average <=69)){

            System.out.println("C");
        }
        else if ((average >70 )&& (average <79)){
            System.out.println("B");
        }
        else if ((average >80) && (average <89)) {

        }
        else if ( (average>90 )&& (average <100)){
            System.out.println("A");
        }
        else {
            System.out.println("invalid");
        }
    }
}