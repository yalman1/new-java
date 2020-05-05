package enums;

public class WeekDays {
    enum WeekDay {
        SUNDAY("Sunday Funday", true),
        MONDAY("Marketing Monday"),
        TUESDAY("Trending Tuesday"),
        WEDNESDAY ("Wellness Wednesday"),
        THURSDAY("Thankful Thursday"),
        FRIDAY("Foodle Friday"),
        SATURDAY("Social Saturday", true);
        private String daysGreeting;
        private boolean isWeekend ;
        WeekDay (final String daysGreeting){
            this.daysGreeting=daysGreeting;
        }
        WeekDay (final String daysGreeting, final boolean isWeekend){
            this(daysGreeting);
            this.isWeekend=isWeekend;
        }
        public String getDaysGreeting (){
            return daysGreeting;
        }
        public boolean isWeekend(){
            return isWeekend;
        }
    }
    public static void main(String[] args) {
        WeekDay day1 = WeekDay.FRIDAY;
        WeekDay day2 = WeekDay.SATURDAY;

        System.out.print(day1 + " : ");
        System.out.println(day1.getDaysGreeting());
        System.out.print(day2 + " : ");
        System.out.println(day2.getDaysGreeting());
        System.out.println(day2.isWeekend());

        if(day1.isWeekend()) System.out.println(day1 + " is weekend");
        if(day2.isWeekend()) System.out.println(day2 + " is weekend");
    }
}
