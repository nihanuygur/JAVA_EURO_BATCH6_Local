package days.day29_Class_Objects;

public class Student {
    String name; // instance variables, fields, properties,attributes -- -just declare nor need to initiation
    int number;
    String city;
    int mathExamResult;
    int scienceExamResult;
    int literatureExamResult;

    public static void main(String[] args) {
        String name;
//        System.out.println("name = " + name);
        Student student1 = new Student();
        student1.name = "Ronaldo";
        Student student2 = new Student();
        student2.name = "Messi";
        System.out.println("student2 = " + student2);
        student1.number = 101;
        student2.number = 102;
        System.out.println("student1.number = " + student1.number);
        System.out.println("student2.number = " + student2.number);
        new Student(); // by using 'new' keyword  we create an object
        Student student3;
        student3 = student1;
        System.out.println("student3.name = " + student3.name);
        student1.city = "London";
        System.out.println("student1.city = " + student1.city);
        System.out.println("student2.city = " + student2.city);
        System.out.println("student1.mathExamResult = " + student1.mathExamResult);
        student1.printStudentInfo();

    }

    public void printStudentInfo() {//instance method
        System.out.println(name);

    }

}
