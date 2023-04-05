package days.day30_JavaMemoryGarbageCollection;

public class Pizza {
    //Flour yeast salt olive oil sugar water meats cheee vegetables pizza sauce
    boolean cheese;
    String size;
    int slice;
    boolean salty;
    boolean vegetable;
    boolean meat;

    // print ingredients
    // eat pizza whenever you eat pizza decrease the value of slices
    public void printIngredients() {
        System.out.print("Your " + size + "size pizza has " + slice + " slices" +"\nIngredients are: ");
        if (salty) {
            System.out.print(" - salt");
        }
        if (cheese) {
            System.out.print(" - cheese");
        }
        if (meat) {
            System.out.print(" - meat");
        }
        if (vegetable) {
            System.out.print(" - vegetable");
        }
        System.out.println();
    }
    public void howManySlices(int n){
        slice-=n;
        if (slice==0){
            System.out.println("Bon appetite, you finished.");
        }else if (n<slice){
            System.out.println("you ate " + n + " slices \nCurrent slice number is  = " + slice);
        }
    }
}
