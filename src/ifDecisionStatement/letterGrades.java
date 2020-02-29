package ifDecisionStatement;

public class letterGrades {
    public static void main(String[] args) {
        int grade =110;

        if (grade<0){
            System.out.println("grade can not be less than 0!");
        }
        else if (grade<50){
            System.out.println("Fail");
        }
        else if (grade<60){
            System.out.println("D");
        }
        else if (grade<70){
            System.out.println("C");
        }
        else if (grade<80){
            System.out.println("B");
        }
        else if (grade<90){
            System.out.println("A");
        }
        else if (grade<100){
            System.out.println("A+");
        }
        else{
            System.out.println("the grade can not be larger than 100");
        }
    }
}
