package days.day48_Encapsulation;

public class Number {
    private int a;
    private int b;
    private String s;
    private double d;
     Number(){
        System.out.println("Hi! ");
    }
    Number(int a,int b,String s,double d){ // Right click + Generate + Constructor
        this.a=a;
        this.b=b;
        this.s=s;
        this.d=d;
    }

    public int getA() { // Right click + Generate + Getter
        return a;
    }

    public double getD() {
        return d;
    }
    public int getB() {
        return b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {  // Right click + Generate + Setter
        this.s = s;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setD(double d) {
        this.d = d;
    }
}
