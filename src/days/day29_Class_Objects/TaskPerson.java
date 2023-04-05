package days.day29_Class_Objects;

public class TaskPerson {
    String name;
    int birthYear;
    String occupation;
    char gender;
    String city;
    String hometown;
    // print the person info
    public static void main(String[] args) {
        TaskPerson person1 = new TaskPerson();
        person1.name = "Nihan";
        person1.birthYear = 1989;
        person1.occupation = "Architect";
        person1.gender = 'F';
        person1.city = "Eskisehir";
        person1.hometown = "Bolu";
        person1.personalInfo();
    }
    public void personalInfo() {
        System.out.println("The Personal Information about " + name);
        System.out.println("BirthYear= " + birthYear);
        System.out.println("Occupation= " + occupation);
        System.out.println("City= " + city);
        System.out.println("Hometown= " + hometown);
        System.out.println("Gender= " + gender);
    }
}
