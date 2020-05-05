package enums;

public class Days {
    enum days {
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday
    }

    public static void main(String[] args) {
       /* Days.days myEnumVar = days.monday;
        Days.days myEnumVar1 = days.tuesday;
        Days.days myEnumVar2 = days.wednesday;
        Days.days myEnumVar3 = days.thursday;
        Days.days myEnumVar4 = days.friday;
        Days.days myEnumVar5 = days.saturday;
        Days.days myEnumVar6 = days.sunday;*/
        for (days day:days.values()) {
            System.out.println(day);
        }
    }
}
