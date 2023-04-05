package days.day25_MethodOverloading;

public class Capitals {
    public static void main(String[] args) {
        String england = capital("England");
        System.out.println("england = " + england);
        System.out.println(capital("Turkiye"));
        String spain=capital("Spain");
        System.out.println("spain = " + spain);
    }

    public static String capital(String country) {
        String capital = "";
        switch (country) {
            case "Norway":
                capital = "Oslo";
                break;
            case "England":
                capital = "London";
                break;
            case "Turkiye":
                capital = "Ankara";
                break;
            case "Germany":
                capital = "Berlin";
                break;
            case "Italy":
                capital = "Roma";
                break;
            case "Spain":
                capital = "Madrid";
                break;
            default:
                capital= "Invalid";
        }
        System.out.println("capital = " + capital);
        return capital;
    }
    public static String capitalReturn(String country) {

        switch (country) {
            case "Norway":
                return  "Oslo";
            case "England":
                return  "London";
            case "Turkiye":
                return  "Ankara";
            case "Germany":
                return  "Berlin";
            case "Italy":
                return  "Roma";
            case "Spain":
                return  "Madrid";
            default:
                return  "Invalid";
        }
    }
}
//    capital("Norway");
//Norway, England,Turkiye,Germany,Italy,Spain
//Oslo, London, Ankara,Berlin,Roma,Madrid