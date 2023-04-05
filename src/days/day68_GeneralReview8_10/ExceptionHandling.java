package days.day68_GeneralReview8_10;

public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException { // Thread.sleep(3000); was giving error
        try{
            System.out.println( "try block");
            System.out.println(1/0);

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("CATCH BLOCK");
        }
//        throw new OutOfMemoryError();
//        System.out.println("fghj");// Unreachable Statement
        pauseRun();


    }
    public static void pauseRun() throws InterruptedException {
        System.out.println("BEFORE sleep");
        Thread.sleep(3000);
        System.out.println("AFTER sleep");
    }

    public static void test() throws InterruptedException {
        //
        pauseRun();
        //
    }
    public static void pauseRun2()  {
        System.out.println("BEFORE sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("AFTER sleep");
    }

    public static void test2() {
        //
        pauseRun2();
        //
    }
}
