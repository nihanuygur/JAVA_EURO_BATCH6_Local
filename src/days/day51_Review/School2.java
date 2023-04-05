//package days.day51_Review;
//
//import java.util.ArrayList;
//
//public class School2 {
//    // student -----> name -----> list -----> schoolNumber -----> capacity -----> absence -----> class??
//    // math science literature -----> grade ----> list
//    // whole student exam results ----> list( name + grade ) -----> total average
//    private static String schoolName;
//    static String studentName;
//    static int schoolId = 100;
//    int studentId ;
//    static int schoolCapacity;
//    int absence = 10;
//    boolean isAbsent;
//
//    double mathGrade;
//    static int examNumMath;
//    static double totalMath;
//    static double mathAverage;
//    static double schoolMathAverage;
//
//    static double scienceGrade;
//    static int examNumScience;
//    static double totalScience;
//    static double scienceAverage;
//    static double schoolScienceAverage;
//
//    double literatureGrade;
//    int examNumLiterature;
//    double totalLiterature;
//    double literatureAverage;
//    double schoolLiteratureAverage;
//
//    ArrayList<String> studentAverageGrades = new ArrayList<>();
//    ArrayList<String> schoolAverageGrades = new ArrayList<>();
//    private static ArrayList<String> studentNameList = new ArrayList<>();
//
//    static {
//        schoolName = "Green Valley School";
//        System.out.println(schoolName);
//    }
//
//    {
//        schoolId++;
//        schoolCapacity++;
//    }
//
//    School2(String studentName) {
//        this.studentName = studentName;
//        System.out.println("Student name: " + studentName + "\nSchool ID : " + schoolId);
//        studentNameList.add(studentName);
//        studentId=schoolId;
//
//    }
//
////    public static double mathGrades(double mathGrade) {
////        totalMath += mathGrade;
////        examNumMath++;
////        mathAverage=mathGrade/examNumMath;
////        System.out.println(studentName+ "'s Math exam average is "+mathAverage);
////    }
////    double scienceGrade, double literatureGrade
////        this.scienceGrade = scienceGrade;
////    examNumScience ++;
////        this.literatureGrade = literatureGrade;
////    examNumLiterature++;
////}
//
//    public static String getSchoolName() {
//        return schoolName;
//    }
//
//    public static ArrayList<String> getStudentNameList() {
//        return studentNameList;
//    }
//
//
//    public void isAbsent(boolean isAbsent) {
//        if (isAbsent){
//            absence--;
//            System.out.println(studentName + " has " + absence + " days for health permission.");
//        }
//    }
//}