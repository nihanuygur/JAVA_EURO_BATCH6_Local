package days.day44;

public class SDET {
    String name;
    int age;
    char gender;
    String  company;
    int salary;
    boolean isSuccessful;

    public SDET(String name, int age, char gender, String company, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccessful = true;
    }

    public void increaseSalary(double raiseAmount){
        this.salary+= raiseAmount;
    }
    public void companyChange(String newCompany){
        this.company=newCompany;

    }

}
class TestSdet{
    public static void main(String[] args) {
        SDET sdet1=new SDET("NihanU",33,'F',"EuroTech", 100000);
        SDET sdet2=new SDET("Alice",25,'F',"Amazon", 150000);
        SDET sdet3=new SDET("Seyit",18,'M',"Mercedes", 100000);
        SDET sdet4=new SDET("Alice",25,'F',"Amazon", 150000);
        System.out.println("sdet1.salary = " + sdet1.salary);
        sdet1.increaseSalary(25000);
        System.out.println("sdet1.salary = " + sdet1.salary);
    }
}
