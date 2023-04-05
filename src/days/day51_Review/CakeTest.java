package days.day51_Review;

public class CakeTest {
    public static void main(String[] args) {
        Cake ronaldoCake = new Cake();
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);
        Cake messiCake = new Cake();
        System.out.println("messiCake.slices = " + messiCake.slices);
        ronaldoCake.eatCake();
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);
        ronaldoCake.eatCake();
        messiCake.eatCake();
        System.out.println("ronaldoCake.slices = " + ronaldoCake.slices);
        System.out.println("messiCake.slices = " + messiCake.slices);
        System.out.println("Cake.familyCake = " + Cake.familyCake);




    }
}
