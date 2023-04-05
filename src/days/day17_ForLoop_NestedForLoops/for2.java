package days.day17_ForLoop_NestedForLoops;

public class for2 {
    public static void main(String[] args) {

        for (int i=0 ; i<5 ; i++){
         // 1(init.)-2(cond)-3(increment)
            System.out.println(i);
            //        4 (body)
            // 1--2--4--3--2--4--3--2--4--3--2--4--3--2--4--3--2
        }

        for (int i =0; i<3; i++) {
            System.out.println("hello");
            System.out.print(i);
        }
    }
}
