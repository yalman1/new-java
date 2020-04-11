package inheritance;

public class ExpoPlannerTest {
    public static void main(String[] args) {
        ExpoPlanner expo1= new ExpoPlanner();
        expo1.listAll();
        expo1.addEvent("may 30", "java oops");
        expo1.listAll();
        expo1.deleteEvent("may 30");
        String[] checklist ={"A","B","C","D","E","F","G","H","I","J"};
        expo1.modifyCheckList("may 30th", checklist);
        expo1.listAll();
    }
}
