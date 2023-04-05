package days.day47FarukT;

public class People {
    private String name;
    private int birthYear;

    String city;


    People(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

}
