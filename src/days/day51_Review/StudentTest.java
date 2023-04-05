package days.day51_Review;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali");
        Student student2 = new Student("Veli");
        Student student3 = new Student("Fatma");
        System.out.println("Student.count = " + Student.count);
        Student student4 = new Student("Mehmet");
        Student student5 = new Student("Ayse");
        Student student6 = new Student("Keti");

        System.out.println("Student.count = " + Student.count);
        System.out.println("student2.count = " + student2.count);
        Student.count=100;
        System.out.println("Student.count = " + Student.count);
        Student student7 = new Student("Ronaldo");
        System.out.println("Student.count = " + Student.count);
        System.out.println("student2.number = " + student2.number);

        System.out.println("Student.nameList = " + Student.nameList);
        System.out.println(student3.number);
    }
}
