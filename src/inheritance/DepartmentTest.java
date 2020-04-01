package inheritance;

public class DepartmentTest {
    public static void main(String[] args) {
        Department myEmp =new Department("Rumeysa", 123, "Qa", 120000);
        System.out.println(myEmp.toString());
        IdDepartment myItDep =new IdDepartment("Rumeysa",234,"tester", 12000, "selenium");
        System.out.println(myItDep.toString());
        myItDep.addSkill("SQL");
        System.out.println(myItDep.toString());
        AccountingDepartment myAcc =new AccountingDepartment("Rumeysa", 463, "accountant", 12000, 3);
        System.out.println(myAcc.toString());
        myAcc.addYearsOfExperience(2);
        System.out.println(myAcc.toString());
    }
}
