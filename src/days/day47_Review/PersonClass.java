package days.day47_Review;

public class PersonClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.birthYear = 1988;
        person1.name = "Veli";
        person1.gender = 'M';

        person1.printInfo();

        Person person2 = new Person("Furkan",2000,'M');
        person2.printInfo();
    }
}
