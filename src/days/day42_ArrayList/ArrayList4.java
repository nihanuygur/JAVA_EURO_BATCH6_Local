package days.day42_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(50);
        number.add(100);
        number.add(20);
        number.add(30);
        number.add(80);
        number.add(90);
        System.out.println("number.indexOf(20) = " + number.indexOf(20));
        // WAY1 to print each element
        for (int i = 0; i < number.size(); i++) {   // number.size() !!
            System.out.println("number = " + number.get(i));
        }
        // WAY2 to print each element
        for (int n : number) {   // you can use like that --> (Integer n : number)
            System.out.println("n = " + n);
        }
        // print reverse
        for (int i = number.size() - 1; i >= 0; i--) {
            System.out.println("number = " + number.get(i));
        }

        int num = number.get(0);
        System.out.println("num = " + num);

        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }

        int i =0;
        do {
            System.out.println("number.get(i) = " + number.get(i));
            i++;
        }while (i<number.size());

        i =0;
        while (i<number.size()){
            System.out.println("number.get(i) = " + number.get(i));
            i++;
        }


    }
}
