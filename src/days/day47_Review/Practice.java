package days.day47_Review;

public class Practice {
    public static void main(String[] args) {
        String str = "abchellohello";
        int count = 0;
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            for (int n = i + 1; n < str.length(); n++) {
                if (str.charAt(i) == str.charAt(n)) {
                    count++;
                }
            }
            if (!newS.contains("" + str.charAt(i))) {
                newS += str.charAt(i);
                System.out.println(str.charAt(i) + " is present in the string " + (count + 1) + " times");
            }
            count = 0;
        }


    }
}
