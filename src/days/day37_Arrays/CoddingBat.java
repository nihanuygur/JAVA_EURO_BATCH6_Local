package days.day37_Arrays;

public class CoddingBat {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6};
        if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String[] players = {"Maradona", "Ronaldo", "Pogba", "Neyma", "Pele"};

        if (players[0].equals("Ronaldo") || players[numbers.length - 1].equals("Ronaldo")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        boolean result = players[0].equals("Ronaldo") || players[numbers.length - 1].equals("Ronaldo"); // OTHER WAY
        System.out.println(result);
        int[] nums = {1, 2, 1};
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        String[] cities2 = {"Istanbul", "London", "Oslo"};
        boolean equals = cities2[0].equals(cities2[cities2.length - 1]);

        System.out.println(equals);

        System.out.println(cities2[0].equals(cities2[cities2.length - 1]) ? true : false); // with ternary

        // commonEnd
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        boolean first = a[0] == b[0];
        boolean last = a[a.length - 1] == b[b.length - 1];
        System.out.println(first || last);

        // SUM OF ALL ELEMENT
        int sum_a = 0;
        for (int i = 0; i < a.length; i++) {
            sum_a += a[i];
        }
        int sum_b = 0;
        for (int i = 0; i < b.length; i++) {
            sum_b += b[i];
        }
        System.out.println(sum_a + sum_b);

        // SHORT WAY
        sum_a = 0;
        sum_b = 0;
        for (int num : a) {
            sum_a += num;
        }
        for (int num : b) {
            sum_b += num;
        }
        System.out.println(sum_a + sum_b);

        int[] nums2 = {1,2,3};
        int temp = nums2[0];
        nums2[0]=nums2[1];
        nums2[1]=nums2[2];
        nums2[2]=temp;


    }
}
