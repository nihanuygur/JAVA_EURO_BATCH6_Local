package days.day48_Encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali",2000,"London");
//        student1.name = "Ali";
//        student1.birthYear = 2000;
//        student1.city = "London";
        System.out.println("student1.getName() = " + student1.getName());
        System.out.println("student1.getBirthYear() = " + student1.getBirthYear());
        System.out.println("student1.getCity() = " + student1.getCity());
        student1.setCity("Eindhoven");
        System.out.println("student1.getCity() = " + student1.getCity());
    }
}
