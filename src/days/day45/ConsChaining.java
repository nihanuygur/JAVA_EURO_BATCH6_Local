package days.day45;

public class ConsChaining {
    int value;
    double rate;
    String id;

    public ConsChaining() {

        this(1);
    }

    public ConsChaining(int value) {
        this(1, 1.5, "STR");
        System.out.println("1 param const!!!");
//        this(1,1.5,"STR"); we must write it at the first line
    }

    public ConsChaining(int value, double rate) {

        this();// calls default constructor !!
    }

    public ConsChaining(int value, double rate, String id) {

    }

    public static void main(String[] args) {


    }
}
