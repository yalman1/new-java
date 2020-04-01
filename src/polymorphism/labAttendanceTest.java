package polymorphism;

public class labAttendanceTest {
    public static void main(String[] args) {
        String students[]={"Melih", "Shohrat", "Ismail"};
        int studentsId[] ={1,2,3};
        String labSubjects[]={"inheritance", "polymorphism", "interfaces"};
        LabAttendance myLab =new LabAttendance( students,studentsId,labSubjects);
        int grades[]={100,100,100};
        myLab.enterGrades("inheritance", grades);
        myLab.printAllGrades();
        myLab.printAttendanceGrades();
    }
}
