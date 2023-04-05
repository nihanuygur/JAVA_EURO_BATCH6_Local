package days.day52FarukT;

public class Lawyer extends Employee {


    Lawyer(String name) {
        super(name);
    }

    public void joinCourt() {
        System.out.println(name + "  went to court.");
    }
}
