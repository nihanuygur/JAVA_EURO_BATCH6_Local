package days.day58FarukT.Base;

public class BaseTest {
    public static void main(String[] args) {
//        BaseMethods baseMethods = new BaseMethods(); not possible to create object from basemethods class
//                it is an abstract class
        Calculate calculate = new Calculate();
        calculate.add();
        calculate.calculate();


    }
}