package days.day23_Methods;

public class Return {
    public static void main(String[] args) {
        int fatherBirthYear = 1970;
        int childBirthYear=2000;
        ageCalculator(fatherBirthYear);  // if you click command+left mouse, it will bring you the method block
        int ageOfFather = ageCalculator(fatherBirthYear);
        ageCalculator(childBirthYear);
        int ageOfChild = ageCalculator(childBirthYear);
        ageCalculator(1989);
        System.out.println(ageOfFather - ageOfChild);
    }
    public  static int ageCalculator(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("age = " + age);
        return age;
        /*
               ^
              /|\
             / | \
            /  |  \
            |  |  |
            |  |  |
            |  |  |
            |  |  |
            |  |  |
            |  |  |
            |  |  |
            _______

         */
    }
}
