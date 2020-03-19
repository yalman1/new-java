package constructor;

public class employeeClass {
    int employeeId;
    String employeeName;
    String employeeDepartment;
    double salary;
    String contractType;


    public employeeClass (int employeeId, String employeeName, String employeeDepartment,
                          double salary, String contractType){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeDepartment=employeeDepartment;
        this.salary=salary;
        this.contractType=contractType;

    }
    public void weeklyPayment (){
        System.out.println(this.salary/52);
    }
    public void biWeeklyPayment (){
        System.out.println(this.salary/26);

    }
    public void employeeInfo (){
        System.out.println("employee id:  "+employeeId);
        System.out.println("employee name:  "+ employeeName);
        System.out.println("employee department:  "+employeeDepartment);
        System.out.println("employee salary:  "+salary);
        System.out.println("employee contract type:  "+contractType);
    }
}
