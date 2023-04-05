package days.day25_MethodOverloading;

public class Methods {
    public static void main(String[] args) {
greaterNumber(10,20);

    }
public  static int greaterNumber(int a,int b){
        int max=0;
        if (a>b){
            max=a;
        }else{
            max=b;

        }
    System.out.println("max = " + max);
        return  max;
    }
}
