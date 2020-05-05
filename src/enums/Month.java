package enums;

public class Month {
    enum month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JLY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }

    public static void main(String[] args) {
        month myMonth =month.JANUARY;
        if(myMonth==month.DECEMBER){
            System.out.println("Snow Time");
        }
        else if(myMonth==month.MARCH){
            System.out.println("Welcome Spring");
        }
        else if(myMonth==month.JUNE){
            System.out.println("Summer Time");
        }
        else if (myMonth==month.SEPTEMBER){
            System.out.println("Leaves fall");
        }
    }
}
