package polymorphism;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank =new Bank(125443, "saving", 350);
        BankLoan myLoan =new BankLoan(234,"saving",132.3,02, 60, 30000  );
        BankCarLoan myCarLoan =new BankCarLoan( 2343, "car", 3000, 04, 72, 40000, 18, 850);
        System.out.println(myCarLoan.calculateMonthlyPayment());
        System.out.println(myCarLoan.calculateTotalPayment());

    }
}
