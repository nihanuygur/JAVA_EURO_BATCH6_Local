package days.day65_66_ErrorExceptionHandling;

public class MyException extends Exception {

    int test;


    public MyException(int test){
        this.test=test;
    }
    @Override
    public String toString() {
        return "MyException value is " + test;
    }
}

class MyExceptionTest {

    public static void main(String[] args) {

        try {
            throw new MyException(200);
        }catch (MyException m ){
//            m.printStackTrace();
            System.out.println(m);
        }

    }

}