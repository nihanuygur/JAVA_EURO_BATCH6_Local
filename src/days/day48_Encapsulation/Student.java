package days.day48_Encapsulation;

public class Student {

    private String name;     //instance of this class
    private int birthYear;
    private String city;

    Student(String name, int birthYear, String city) {
        this.name = name;
        this.birthYear = birthYear;
        this.city = city;
    }

    private void printName() {
        System.out.println("name = " + name);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
