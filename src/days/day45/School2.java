package days.day45;

public class School2 {
    String  schoolName;
    String headTeacher;
    int studentNumber;
    static int schoolId=1000; // with static, schoolId belongs to the class !!
    int teacherNumber;
    boolean isSchoolActive;

    public School2() { // default constructor
        this.schoolId ++;
        this.isSchoolActive = true;
    }

    public School2(String schoolName) {
        this(); // calls default constructor so we don't need to type -> this.schoolId ++; and this.isSchoolActive = true;
        this.schoolName = schoolName;

    }

    public School2(String schoolName, String headTeacher, int studentNumber, int teacherNumber) {
        this(); // calls default constructor so we don't need to type -> this.schoolId ++; and this.isSchoolActive = true;
        this.schoolName = schoolName;
        this.headTeacher = headTeacher;
        this.studentNumber = studentNumber;
        this.teacherNumber = teacherNumber;


    }
}

class LocalSchool{
    public static void main(String[] args) {
        School2 school1 = new School2("Alice Primary School","Adam Smith",130,10);
        System.out.println("school1.schoolId = " + school1.schoolId);
        System.out.println("school1.headTeacher = " + school1.headTeacher);
        System.out.println("school1.isSchoolActive = " + school1.isSchoolActive);

        School2 school2 = new School2("Ataturk Primary School", "Mehmet Oz", 100,11);
        System.out.println("school2.schoolId = " + school2.schoolId);

        School2 school3 = new School2("Alpha Primary School", "Jenny Smith", 111,13);
        System.out.println("school3.schoolId = " + school3.schoolId);

        School2 school4 = new School2("Walkers High School");
        System.out.println("school3.schoolId = " + school3.schoolId);

        School2 school5 = new School2();
        System.out.println("school3.schoolId = " + school3.schoolId);

    }
}