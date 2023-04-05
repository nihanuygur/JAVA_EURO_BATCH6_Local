package days.day38_Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String city = "Roma";
        String[] cities = {city, "Istanbul", "Oslo", "London"};
        // if there is an element starts with 'O'
        for (String n:cities){
            if(n.startsWith("O")){
                System.out.println(n);
            }
        }



    }
}
