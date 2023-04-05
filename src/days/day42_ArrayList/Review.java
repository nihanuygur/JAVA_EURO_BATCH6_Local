package days.day42_ArrayList;

public class Review {
    public static void main(String[] args) {
        int [] numbers = {20,30,40,50,5,9,8};
        //                0  1  2  3  4 5 6
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[6] = " + numbers[6]);
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]); // last element
        for (int number :numbers){
            System.out.println("number = " + number);
        }

        int [] numbers2 = new int[5];


    }
}
