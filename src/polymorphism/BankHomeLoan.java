package polymorphism;

public class BankHomeLoan extends BankCarLoan {
    double PMI;

    public BankHomeLoan(int accountNumber, String accountName, double balance, int interestRate, int numberOfPayment, int loanAmount, int APR, int creditScore, int PMI) {
        super(accountNumber, accountName, balance, interestRate, numberOfPayment, loanAmount, APR, creditScore);
        this.PMI = PMI;
    }

    public double calculateMonthlyPayment (){
        double result=super.loanAmount*super.interestRate/super.numberOfPayment+this.PMI;
        return result;
    }
    public double calculateTotalPayment (){
        double total =super.loanAmount*super.interestRate+this.PMI*super.numberOfPayment;
        return total;
    }

}
