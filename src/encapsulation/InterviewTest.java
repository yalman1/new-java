package encapsulation;

public class InterviewTest {
    public static void main(String[] args) {
        Interview candidate1 = new Interview("Nihal",100,100,100);
        System.out.println(candidate1.toString());
        System.out.println(candidate1.decideResult());
        candidate1.calculateScore();
        System.out.println(candidate1.decideResult());
    }

}
