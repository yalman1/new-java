package inheritance;

public class AccountingDepartment extends Department {
    private   int yearsOfExperiment;

    public AccountingDepartment (String employeeName, int employeeId, String position, double salary, int yearsOfExperiment){
        super(employeeName, employeeId, position, salary);
        this.yearsOfExperiment=yearsOfExperiment;
    }

    public int getYearsOfExperiment() {
        return yearsOfExperiment;
    }

    public void setYearsOfExperiment(int yearsOfExperiment) {
        this.yearsOfExperiment = yearsOfExperiment;
    }

    void addYearsOfExperience (int years){
        this.yearsOfExperiment+=years;
    }

}
