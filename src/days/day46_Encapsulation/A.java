package days.day46_Encapsulation;

public class A {
    // String s - int i -
    private String s;
    private int i;

    A(String s,int i){ // short way -> right click + Generate + Constructor + Select fields from list
        this.s=s;
        this.i=i;
    }
    public String getS(){
        return s;
    }
//    public int getI(){
//        return i;
//    }

    public int getI() {  // short way -> right click + Generate + Getter + Select fields from list
        return i;
    }


}
