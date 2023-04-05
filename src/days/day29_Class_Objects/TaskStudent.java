package days.day29_Class_Objects;
public class TaskStudent {
    String name;
    int number;
    int mathExamResult;
    int scienceExamResult;
    int literatureExamResult;
    // print exam results with name
    // in different method print the average of the result of the person
    public static void main(String[] args) {
        TaskStudent student1 = new TaskStudent();
        student1.name = "Ali";
        student1.number = 101;
        student1.mathExamResult = 90;
        student1.scienceExamResult = 85;
        student1.literatureExamResult = 50;
        student1.examResults();
        student1.averageOfExams();
    }
    public void examResults() {
        System.out.println("Math Exam Result of " + name + " = " + mathExamResult);
        System.out.println("Science Exam Result of " + name + " = " + scienceExamResult);
        System.out.println("Literature Exam Result of " + name + " = " + literatureExamResult);
    }
    public void averageOfExams() {
        double average = (mathExamResult + scienceExamResult + literatureExamResult) / 3;
        System.out.println("Exam Average of " +  name+ " - (School Number: " +  number+ ") = " + average);
    }
}
