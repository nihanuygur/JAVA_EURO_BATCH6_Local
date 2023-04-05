package codeBat;

public class NewFormuls {
    public static void main(String[] args) {

//        Given a string, return a new string where "not " has been added to the front.
//        However, if the string already begins with "not", return the string unchanged.
//        Note: use .equals() to compare 2 strings.
//
//        notString("candy") → "not candy"
//        notString("x") → "not x"
//        notString("not bad") → "not bad"

            //SOLUTION 1
        String str = "Candy" ;

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
                System.out.println(str);
        }else {
                System.out.println(("not " + str));
        }

            //SOLUTION 2
        System.out.println((str.startsWith("not")) ? str : "not " + str);







        // StringName.startsWith("...")
        // StringName.endsWith("...")
        // StringName.length()
        // StringName.substring(0, 3) --> belirtilen araligi seciyor
        // .equals("...")  checking equality for strings
        // Math.abs (...) absolute --- mutlak deger

    }
}
