package polymorphism;

public class AttendanceTest {
    public static void main(String[] args) {
        String[] students = {"Birsen","Esra","Inci","Mehmet","Nihal"};
        int [] ids = {1,2,3,4,5};
        Attendance myAtt = new Attendance(students,ids);
        myAtt.enterAttendanceToday("tue");
        myAtt.enterAttendanceToday("mon");
        myAtt.printWeeklyAttendance();
        myAtt.findTheMostAttended();
        myAtt.findTheMostAttendedDay();

    }
}
