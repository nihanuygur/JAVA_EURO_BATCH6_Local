package days.day35_StringMethods;

public class Methods3 {
    public static void main(String[] args) {

        String club = "Atletico Madrid, Real Madrid";
        //     INDEX   0123456789012345678901234567
        System.out.println("club.contains(\"Roma\") = " + club.contains("Roma")); //  false
        System.out.println("club.contains(\"Madrid\") = " + club.contains("Madrid")); //  true
        System.out.println("club.contains(\"madrid\") = " + club.contains("madrid")); //  false -- Java is case sensitive
        System.out.println("club.contains(\"A\") = " + club.contains("A")); // true

        System.out.println("club.indexOf(\"Madrid\") = " + club.indexOf("Madrid")); //  9 -- first letter's index number
        System.out.println("club.indexOf(\"Madrid\") = " + club.lastIndexOf("Madrid")); //  22 -- right to left
        System.out.println("club.indexOf(\"Madrid\") = " + club.indexOf("madrid")); // -1
        int middleIndex= (club.indexOf("Madrid")+1);
        System.out.println("(club.indexOf(\"Madrid\",middleIndex)) = " + club.indexOf("Madrid", middleIndex));
        System.out.println("(club.replace(\"Madrid\",\"Roma\")) = " + club.replace("Madrid", "Roma"));
        System.out.println("club = " + club);
        String afterReplace= club.replaceAll("Madrid", "Oslo");
        System.out.println("afterReplace = " + afterReplace);
        System.out.println("club = " + club);
        String city = "Bremen";
        city="Roma";
        System.out.println("city.equals(\"Roma\") = " + city.equals("Roma"));
        System.out.println("city.equals(\"roma\") = " + city.equals("roma")); //false
        System.out.println("city.equalsIgnoreCase(\"roma\") = " + city.equalsIgnoreCase("roma")); //true

    }
}
