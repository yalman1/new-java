package loops;

public class CalendarWhileLoop {
    public static void main(String[] args) {
        int month=1;
        int day;


        while(month<=12){
            day=1;     // nested in icinde olmali
            while(day<31){
                System.out.println(month+" / "+day+" / "+"2020");
                day++;


            }
            month++;
        }
    }
}
