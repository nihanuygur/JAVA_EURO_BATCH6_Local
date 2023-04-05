package days.day58_Abstraction.employee;

public abstract class Employee extends Salary {

    double bonus;

    public void increaseSalary() {
        salary = salary * (1.0 + bonus);
        System.out.println("salary = " + salary);
    }


}
