package inheritance;

public class MoneyPrint {
    public static void main(String[] args) {
        System.out.println(Money.machineSerial);
        Money hundred =new Money(100, 12345);
        System.out.println(hundred.serial);
        Money fifty =new Money(50, 365484);
        System.out.println(Money.machineSerial);
        System.out.println(fifty.serial);
        System.out.println(hundred.value);
    }
}
