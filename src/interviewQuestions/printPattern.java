package interviewQuestions;

public class printPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+"\t");
            for (int j = 1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
