package days.day46_Encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(); // creating an object/instance --> to reach class
        Student student2 = new Student();
        Student student3 = new Student();
        student1.age = 30;
        student1.name = "Tarik";
        student2.name = "Yusuf";
        student2.age = 25;
        System.out.println("student3.name = " + student3.name);
        student3.name = "Kseniia";
        student3.age = 23;

        student2.print(); // as a template, u can use it limitless time
        student1.print();
        student3.print();

        Student.print5(); // static method, we call with className
        student1.print(); // non-static, we call with object

        student1.studying();
        student2.studying();

        student1.printAge();
        student2.printAge();
        student1.mathGrade = 90.50;
        student1.scienceGrade = 98.70;
        student1.literatureGrade = 75.65;
        student2.mathGrade = 95.35;
        student2.scienceGrade = 87.25;
        student2.literatureGrade = 99.10;

        student1.examResult();
        student2.examResult();
        student3.examResult();

        student1.examAverage();
        student2.examAverage();

    }
}
