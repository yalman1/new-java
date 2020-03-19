package constructor;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee melih = new Employee(999,"Melih","QA",129000,"full time");
        System.out.println(melih.calculateWeeklyPayment());
        System.out.println(melih.calculateBiWeeklyPayment());
        System.out.println(melih.toString());
        Employee ferhat = new Employee(888,"Ferhat","IT",130000,"full time");
        System.out.println(ferhat.toString());
        System.out.println(ferhat.calculateBiWeeklyPayment());
    }
}
