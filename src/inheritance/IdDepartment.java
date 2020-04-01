package inheritance;

public class IdDepartment extends Department {

    protected String skillSet;

    public IdDepartment(String employeeName, int employeeId, String position, double salary, String skillSet) {
        super(employeeName, employeeId, position, salary);
        this.skillSet="";
    }
    public void addSkill (String newSkill){
        this.skillSet=this.skillSet +" "+newSkill;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    @Override
    public String toString() {
        return "IdDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
