package days.day58_Abstraction.employee;

public class Test {
    public static void main(String[] args) {
        // Salary salary = new Salary();
        Lawyer lawyer = new Lawyer();
        System.out.println("lawyer.salary = " + lawyer.salary);
        lawyer.increaseSalary();
        Sdet sdet = new Sdet();
        sdet.increaseSalary();
    }
}
