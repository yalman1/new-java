package polymorphism;

public class LabAttendance extends Attendance{
    private String[] labSubjects;
    private int [][] labGrades;

    public LabAttendance(String[] students, int[] studentId, String[] labSubjects) {
        super(students, studentId);
        this.labSubjects = labSubjects;

        int [][] grades=new int [this.labSubjects.length][super.getStudents().length];
        this.labGrades=grades;
    }
    public String [] getLabSubjects (){
        return this.labSubjects;
    }
    public int findIndex (String subject){
        int index=0;
        for (int i = 0; i <this.labSubjects.length ; i++) {
            if (this.labSubjects[i]. equalsIgnoreCase(subject)){
                index=i;
            }
        }
        return index;
    }
    public void enterGrades (String subject, int []grade){
        int index = this.findIndex(subject);
        this.labGrades[index]=grade;
    }
    public void printAllGrades (){
        System.out.println("\t\t\t");
        for (String student :super.getStudents()){
            System.out.println(student+"\t\t");
        }
        System.out.println();
        for (int i = 0; i <this.labSubjects.length ; i++) {
            System.out.println(this.labSubjects[i]+"\t\t");
            for (int j = 0; j <super.getStudents().length; j++) {
                System.out.println(this.labGrades[i][j]+"\t\t");
            }
            System.out.println();
        }
        }
    public void printAttendanceGrades (){
        super.printWeeklyAttendance();
        this.printAllGrades();
    }

}
