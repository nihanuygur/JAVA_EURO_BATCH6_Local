package days.day47_Review;

public class Person {
    String name;
    int birthYear;
    char gender;

    Person() {
        System.out.println("An object is created from PersonClass");
    }
    Person(String name,int birthYear,char gender) {
        this.name=name;
        this.gender=gender;
        this.birthYear=birthYear;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("birthYear = " + birthYear);
        System.out.println("gender = " + gender);
    }
}
