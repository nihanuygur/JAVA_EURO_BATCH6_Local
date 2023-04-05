package days.day48_Encapsulation;

public class NumberTest {
    public static void main(String[] args) {
        Number number = new Number(150,200,"Hello!",4.4);
//        number.a=100;
        number.setA(999);
        System.out.println("number.getA() = " + number.getA());
    }

}
