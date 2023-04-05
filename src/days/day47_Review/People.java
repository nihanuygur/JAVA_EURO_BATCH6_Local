package days.day47_Review;

public class People {
    private String  name;
    private int birthYear;


    People (String name,int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public String getName(){
        return name;
    }
    public int getBirthYear(){
        return  birthYear;
    }
}
