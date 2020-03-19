package constructor;

public class Employee {
    //Attribute declaration
    int employeeId;
    String employeeName;
    String department;
    double salary;
    String contractType;
    //Constructor without parameter
    public Employee(){
        this.employeeId=123;
        this.employeeName="John Doe";
        this.department="temp";
        this.salary=89999;
        this.contractType="temp";
    }
    //Constructor with parameter. We are overloading the Constructor
    public Employee(int employeeId, String employeeName, String department, double salary, String contractType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.contractType = contractType;
    }
    public double calculateWeeklyPayment(){
        double weekly = this.salary/52;
        return weekly;
    }
    public double calculateBiWeeklyPayment(){
        double biWeekly = this.salary/26;
        return  biWeekly;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", contractType='" + contractType + '\'' +
                '}';
    }
}
