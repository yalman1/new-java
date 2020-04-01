package inheritance;

public class Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;

    public Department(String employeeName, int employeeId, String position, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }
    public Department (){
        this.employeeName="temp";
        this.employeeId=123;
        this.position="intern";
        this.salary=1000;
    }

     void changePosition (String newPosition){
        this.position=newPosition;
    }
    public double riseSalary (double newSalary){
        return this.salary+=newSalary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
