package days.day49_StaticClassMembers;

public class Devices {
    String name;
    long serialNumber;
    boolean isActive;
    double value;
    public String status;

    static int deviceCounter;

    public Devices(String name, long serialNumber, double value) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.value = value;
        isActive=true;
        deviceCounter++;
    }
    public void setStatus(String newCondition){
        this.status=newCondition;
    }

    public void test(){
        name="Test";
        deviceCounter =2222;
    }
    public static void staticTest(){
        // name = "Test"; can't access name,which obj's name ??
//        this.name = "2"; can't use 'this' keyword, because it is referring to obj, and
//        we can't provide an object to static methods

    }
    public String getStatus(){
        return status;
    }

    public static void main(String[] args) {
        Devices d1= new Devices("Laptop",1001,500);
        d1.setStatus("Good");
        d1.name="Test";

        System.out.println("d1.getStatus() = " + d1.getStatus());
        System.out.println("Devices.deviceCounter = " + Devices.deviceCounter);

        Devices d2= new Devices("Monitor",1002,300);
        d2.setStatus("Broken");
        System.out.println("d2.getStatus() = " + d2.getStatus());
        System.out.println("Devices.deviceCounter = " + Devices.deviceCounter);

        Devices d3= new Devices("Keyboard",1003,50);
        System.out.println("Devices.deviceCounter = " + Devices.deviceCounter);

        Devices.staticTest();
        // name = "Test"; can't access name,which obj's name ??
    }


}

