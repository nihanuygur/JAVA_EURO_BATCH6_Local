package days.day23_Methods;

public class methods2 {
    public static void main(String[] args) {
        printAge(37);
        int number =40;
        printAge(number);
        ageName("Ali", 4);
        String player= "Pele";
        int agePlayer=35;
        ageName(player,agePlayer);
        // Hi String name
        methods.doubleN(20);  // we can call methods from other files. --> className.methodName()

    }

    public static void printAge(int age) {
        System.out.println("Ronaldo is " + age + " years old");

    }
    public  static  void ageName(String name,int age){ // we can add more parameters than 1.
        System.out.println(name + " is "+ age + " years old.");
    }


}
