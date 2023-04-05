package days.day58_Abstraction.employee;

public class Lawyer extends Employee {

    Lawyer() {
        super.salary = 3000;
        super.bonus=0.1;
    }
    {
        super.salary = 4000;
    }

    @Override
    public void setSalary(double salary) {

    }
}
