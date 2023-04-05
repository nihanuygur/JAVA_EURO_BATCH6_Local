package days.Replit;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee("Ali","Celik",5.000);
        Employee employee1=new Employee("Veli","Celik",6.000);
        System.out.println("employee1.yearlySalary() = " + employee1.yearlySalary());
        System.out.println("employee.yearlySalary() = " + employee.yearlySalary());
        employee1.raiseSalary();
        employee.raiseSalary();
        System.out.println("employee1.yearlySalary() = " + employee1.yearlySalary());
        System.out.println("employee.yearlySalary() = " + employee.yearlySalary());
        System.out.println("employee1.getSalary() = " + employee1.getSalary());
        System.out.println("employee1.getSalary() = " + employee.getSalary());
    }
}
