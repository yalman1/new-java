package loops;

public class calendarDoWhile {
    public static void main(String[] args) {
        int month=1;    //only declaration better
        int day;
        do{
            day=1;
            do{
                System.out.println(month+" / "+day+" / "+"2020");
                day++;
            }
            while(day<31);
            month++;
        }
        while(month<13);
    }
}
