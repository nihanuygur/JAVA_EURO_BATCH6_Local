package days.day44;

public class School {
    String  schoolName;
    String headTeacher;
    int studentNumber;
    static int schoolId=1000; // with static, schoolId belongs to the class !!
    int teacherNumber;
    boolean isSchoolActive;

    public School() {
        this.schoolId ++;
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.schoolId ++;
    }

    public School(String schoolName, String headTeacher, int studentNumber, int teacherNumber) {
        this.schoolName = schoolName;
        this.headTeacher = headTeacher;
        this.studentNumber = studentNumber;
        this.teacherNumber = teacherNumber;
        this.isSchoolActive = true;
        this.schoolId ++;
    }
}

class LocalSchool{
    public static void main(String[] args) {
        School school1 = new School("Alice Primary School","Adam Smith",130,10);
        System.out.println("school1.schoolId = " + school1.schoolId);
        System.out.println("school1.headTeacher = " + school1.headTeacher);
        System.out.println("school1.isSchoolActive = " + school1.isSchoolActive);

        School school2 = new School("Ataturk Primary School", "Mehmet Oz", 100,11);
        System.out.println("school2.schoolId = " + school2.schoolId);

        School school3 = new School("Alpha Primary School", "Jenny Smith", 111,13);
        System.out.println("school3.schoolId = " + school3.schoolId);

        School school4 = new School("Walkers High School");
        System.out.println("school3.schoolId = " + school3.schoolId);

        School school5 = new School();
        System.out.println("school3.schoolId = " + school3.schoolId);

    }
}