package enums;

public class FIRST {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myEnumVar = Level.LOW;
        System.out.println(myEnumVar);
    }
}
