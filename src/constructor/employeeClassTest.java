package constructor;

public class employeeClassTest {
    public static void main(String[] args) {
        employeeClass info=new employeeClass(88743, "john", "IT",
                106000, "full time");

        info.weeklyPayment();
        info.biWeeklyPayment();
        System.out.println();
        info.employeeInfo();

    }
}
