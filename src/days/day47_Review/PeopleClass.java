package days.day47_Review;

public class PeopleClass {
    public static void main(String[] args) {
        People people = new People("Bahadir",2000);
//        people.name !!!! private String name
        System.out.println("people.getName() = " + people.getName());
        System.out.println("people.getBirthYear() = " + people.getBirthYear());

        People people1 = new People("Keti",1990);
        System.out.println("people1.getBirthYear() = " + people1.getBirthYear());
    }
}
