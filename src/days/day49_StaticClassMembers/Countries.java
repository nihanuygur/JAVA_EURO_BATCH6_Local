package days.day49_StaticClassMembers;

public class Countries {

    // DATA FIELDS
    static int countryCounter;
    int dummyCounter;
    String name;

Countries(String name){
    this.name=name;
    dummyCounter=1;
    countryCounter++;

}
    public static void main(String[] args) {
        Countries country1 = new Countries("India");
        System.out.println("country1.dummyCounter = " + country1.dummyCounter);
        country1.dummyCounter=100;
        System.out.println("country1.dummyCounter = " + country1.dummyCounter);

        Countries country2 = new Countries("France");
        System.out.println("Countries.countryCounter = " + Countries.countryCounter); //2
        System.out.println("country1.countryCounter = " + country1.countryCounter); //2
        System.out.println("country1.dummyCounter = " + country1.dummyCounter);
        System.out.println("country2.dummyCounter = " + country2.dummyCounter);

    }
}
