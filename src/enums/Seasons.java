package enums;

public class Seasons {
    enum Season {
        SPRING,
        WINTER,
        SUMMER,
        AUTUMN,
    }

    public static void main(String[] args) {
        Season myEnum = Season.SPRING;
        Season myEnum2 = Season.WINTER;
        Season myEnum3 = Season.SUMMER;
        Season myEnum4 = Season.AUTUMN;
        System.out.println(myEnum);
        System.out.println(myEnum2);
        System.out.println(myEnum3);
        System.out.println(myEnum4);

    }
}
