package days.day25_MethodOverloading;

public class Student {
    public static void main(String[] args) {
        // name (110) will return a name"ronaldo"
        //110 120 130 140 150 160 name and number
        System.out.println(name(120));
        //grade (80);
        System.out.println(result(130, 80));
    }
    public static  String name(int studentNumber){
        switch (studentNumber){
            case 110:
                return "Ronaldo";
            case 120:
                return "Messi";
            case 130:
                return "Veli";
            case 140:
                return "Ali";
            case 150:
                return "Ayse";
            case 160:
                return "Hasan";
            default:
                return "not found";
        }
    }
    public static  char grade(int point){
        char grade='A';
        if (point>=80&& point<=100){
            grade='A';
        }else if (point<80&&grade>=60){
            grade='B';
        }else if (point<60&&grade>=30){
            grade='C';
        }else {
            grade='D';
        }
        return grade;
    }
    public  static  String result(int studentNumber, int point){
        String nameGrade = (name(studentNumber) + "'s  grade is " + grade(point));
        return nameGrade;
    }
}
