package days.day9_UnaryAssignmentRelational;

public class UnaryDecrement {
    public static void main(String[] args) {
        int a = 10;
        --a; //predecrement
        System.out.println("a = " + a);
        a--; // postdecrement
        System.out.println("a = " + a); //8
        int b = a;
        System.out.println("b = " + b);
        a = --b; // a and b = 7
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        a = b--; // before assignment a is 7 b is 7 after assignment, a still 7 but b is 6
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 10;
        System.out.println(--a); // 9
        System.out.println(a--); // still 9, we will see the new value in the next line
        System.out.println(a);

        int n = 5;
        int i = n--; // -- decrement value of variable
        int l = --n;
        System.out.println("l = " + l);
        System.out.println("n = " + n);
        System.out.println("i = " + i);
        System.out.println(n); // 3
        System.out.println(--n); //2
        System.out.println("n = " + n);// 2
        //////
        int no = 5;
        int n2 = -20000;
        n2 = no++;
        System.out.println("n2 = " + n2);
        System.out.println("no = " + no);
        ///
        i = 3;
        i++; // Preincrement
        System.out.println(i); // 4
        ++i; // Postincrement
        System.out.println(i); // 5
        System.out.println(++i); // 6
        System.out.println(i++); // 6
        System.out.println(i++); // 7
        System.out.println(i); // 8

        ////
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        //  y     4 * 5 / 4   +   2

        System.out.println("x = " + x);
        System.out.println("y = " + y);
////////
        int s, t, r;

        s = t = r = 5;

        int exp = s + t++ + ++r;
        System.out.println("exp = " + exp);
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);

        r=6;
        s = r-- + r-- + r;
        System.out.println("s = " + s);
        System.out.println("s = " + s++ + s++);
        System.out.println(2.5 * 2 + 8 / 5.0 + 10 / 3);
        System.out.println(4 * 3 / 8 + 2.5 * 2);
        System.out.println(41 % 7 * 3 / 5 + 5 / 2 * 2.5);
        System.out.println(2 + " 2 + 3 " + 4);
        System.out.println(1 + 1 + "8 - 2" + (8 - 2) + 1 + 1);
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
    }
}
