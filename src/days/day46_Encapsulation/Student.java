package days.day46_Encapsulation;

public class Student {
    String name; // Attribute - global // they belong to the objects
    int age;  // non-static
    // non-static -> unique
// static -> general, not unique
    double mathGrade;
    double literatureGrade;
    double scienceGrade;


    //public -> reachable + access modifier
    public void print() { // not static - instance method - this method belongs to the object
        System.out.println("name: " + name);

    }

    public static void print5() {
//    System.out.println("name: "+ name); // we cant reach unique name with general/non-static methods
        System.out.println("Hello student!");
    }

    public void studying() { //Behavior
        System.out.println(name + " is studying");
    }

    public void printAge() {
        System.out.println(name + "'s age is " + age);
    }

    public void examResult() {
        System.out.println(name + "'s exam results are printed.");
        System.out.println("mathGrade = " + mathGrade);
        System.out.println("scienceGrade = " + scienceGrade);
        System.out.println("literatureGrade = " + literatureGrade);
    }

    public void examAverage() {
        System.out.println(name+"'s exam average is = " + (scienceGrade + mathGrade + literatureGrade) / 3);
    }


}
