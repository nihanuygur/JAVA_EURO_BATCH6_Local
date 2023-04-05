package days.day30_JavaMemoryGarbageCollection;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
        order1.slice=4;
        order1.cheese=true;
        order1.salty=true;
        order1.meat=true;
        order1.vegetable=false;
        order1.size= "Medium";
        order1.printIngredients();
        order1.howManySlices(3);

        Pizza order2 = new Pizza();
        order2.slice=6;
        order2.size="Big";
        order2.cheese=true;
        order2.salty=false;
        order2.meat=false;
        order2.vegetable=true;
        order2.printIngredients();
        order2.howManySlices(6);
    }
}
