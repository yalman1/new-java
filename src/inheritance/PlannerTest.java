package inheritance;

public class PlannerTest {
    public static void main(String[] args) {
        Planner myPlan =new Planner();

        myPlan.addEvent("April 10", "Java String");
        myPlan.addEvent("may 12", "Java Corrections ");
        myPlan.addEvent("June 15", "Interview prep");
        myPlan.deleteEvent("may 12");


    }
}
