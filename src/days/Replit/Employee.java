package days.Replit;

public class Employee {
    /*
    # Employee

 * Create a class called Employee that includes three pieces of information as instance variables

- a first name (typeString),
- a last name (typeString) and
- a monthly salary (double).

Your class should have a constructor that initializes the three instance variables. Provide a set and a get method
for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named
EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.

Note: To create a new class click to new file button on the right top of page
     */
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        if(salary<0){
            salary=0.0;
        }
    }
public double yearlySalary(){
        return salary*12;
}
public double raiseSalary(){
        salary= salary*1.1;
        return salary;
}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
