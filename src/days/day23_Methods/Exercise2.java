package days.day23_Methods;

public class Exercise2 {
    public static void main(String[] args) {
        //hello name
        String ali = helloName("Ali");
        System.out.println(ali);


    }
    public  static String helloName(String name){
        String sayHello= "Hello " + name;
        return sayHello;
//        System.out.println("shkjhs"); unreachable statement,return like as break
    }
}
