package loops;

public class CalendarForLoop {
    public static void main(String[] args) {

        for (int month=1; month<=12; month++) {
            System.out.println("month"+month+"\n_______________");
            for (int day = 1; day < 31; day++) {
                System.out.println(month +" / "+ day +" / " + "2020");

            }
            if (month!=12) {
                System.out.println("--------------------");
            }
        }
    }
}
