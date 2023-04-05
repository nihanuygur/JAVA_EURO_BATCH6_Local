package days.day35_StringMethods;

public class Methods2 {
    public static void main(String[] args) {
        String name = "Ronaldo"; // string pool
        String name2 = "Messi";
        System.out.println("name+name2 = " + name + name2); //RonaldoMessi
        System.out.println("name.concat(name2) = " + name.concat(name2)); // RonaldaMessi
        System.out.println(name); // Ronaldo
        name2.concat(" scored 4 goals.");
        //name= "Michael";
        System.out.println("name = " + name);
        String player = "Ronaldo";
        System.out.println(name==player); // true
        String name3=name2;




    }
}
