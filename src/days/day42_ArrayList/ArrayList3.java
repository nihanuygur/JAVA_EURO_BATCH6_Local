package days.day42_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(5);  // 2
        numbers.add(15); // 3
        numbers.add(35); // 4
        numbers.add(25); // 5
        System.out.println("numbers = " + numbers);
        numbers.add(0,1);
        System.out.println("numbers = " + numbers);
        numbers.remove(1); // with index number
        Integer i = 5;
        numbers.remove(i); // or numbers.remove(numbers.indexOf(5));
        System.out.println("numbers = " + numbers);
        // Calling remove(index)
         numbers.remove(1); //removing object at index 1 i.e. 2nd Object, which is 2

        // Calling remove(object)
         numbers.remove((Integer)5);

       numbers.contains(200);
       ArrayList<Integer> numbers5 = new ArrayList<>();
        System.out.println("numbers.equals(numbers5) = " + numbers.equals(numbers5));
        numbers5 = numbers;
        System.out.println("numbers.equals(numbers5) = " + numbers.equals(numbers5));
        numbers.set(0,5000);
        System.out.println(numbers);
        for (Integer n : numbers) {
            System.out.println("n = " + n);

        }
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(4,55);


    }
}
