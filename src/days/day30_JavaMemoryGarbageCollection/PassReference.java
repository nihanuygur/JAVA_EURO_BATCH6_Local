package days.day30_JavaMemoryGarbageCollection;

import days.day29_Class_Objects.TaskStudent;

public class PassReference {
    public static void main(String[] args) {
        int number =100;
        printNumber(number);

    }
    public  static  void printNumber(int n){
        System.out.println("n = " + n);

    }
    public void printNumber(TaskStudent student){
        student.examResults();
    }
}
