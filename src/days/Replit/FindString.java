package days.Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindString {
    /*
    # Search String İn ArrayList

  * Create a method to search a arraylist of string includes given string or not. If yes display the result.

 example:

 ["2", "abc", "foo", "bar", "europe"]

   findString(list, bar)

output:

``There is same string bar in index 3``
     */
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("2", "abc", "foo", "bar", "europe"));
        findString(list,"bar");
    }

    public static void findString(ArrayList<String > list,String str){
        for (int i = 0; i < list.size(); i++) {
             if (list.get(i).equals(str)){
                 System.out.println("There is same string "+str+" in index "+i);
             }
        }
    }
}
