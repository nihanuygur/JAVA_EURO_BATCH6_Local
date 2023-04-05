package days.day23_Methods;

public class Recorsion {
    public static void main(String[] args) {
        print(5);

    }
    public  static void print(int n){
        if(n>0){
            print(n-1);
        }
        System.out.println("n = " + n);
    }
}
// fibonacci numbers
// sum of the numbers between 