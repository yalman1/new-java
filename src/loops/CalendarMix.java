package loops;

public class CalendarMix {
    public static void main(String[] args) {
        // while and for
        int month = 1;
        while (month < 13) {
            for (int day = 1; day <= 30; day++) {
                System.out.println(month + " / " + day + " / " + "2020");
            }
            month++;
        }
        //for and while
        int daywhile;
        for (int monthfor=1; monthfor<13; monthfor++){
            daywhile=1;
            while (daywhile<31){
                System.out.println(monthfor + " / " + daywhile + " / " + "2020");
                daywhile++;

            }
        }
    }
}
