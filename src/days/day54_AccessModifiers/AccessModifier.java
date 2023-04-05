package days.day54_AccessModifiers;

public class AccessModifier {
    public int value = 5;
    private String password="12QWEsda$";
    String pageElement= "button[id='Register']"; // if u not provide any access, it means default
    protected boolean isActive = true;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    protected void  testModifier(){

    }
    public void testOverriding(){
        System.out.println("AccessModifier PARENT class");
    }
}
