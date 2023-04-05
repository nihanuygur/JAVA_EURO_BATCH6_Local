package days.day56_FinalKeyword;

public class HidingFields { // PARENT CLASS

    int parentValue;
    int count; // we hid this variable

    public HidingFields(){
        count=111;
    }

    public void  test(){
        System.out.println("parentValue = " + parentValue);
    }
    public void verify(){
        System.out.println("Parent verify");
    }
}
