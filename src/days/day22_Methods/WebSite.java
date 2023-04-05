package days.day22_Methods;

public class WebSite {
    public static void main(String[] args) {
        // Open the Browser chrome-firefox-edge-explorer
        // navigate to www.hotmail.com
        // Enter your username
        // enter your password
        // Click on login button

//        openTheBrowser();
//        navigateToHotmail();
//        enterUsername();
//        enterPassword();
//        clickButton();

        hotmail();
        System.out.println();
        sum.sumOfTheNumbers0To50(); // we can call the method like that className.MethodName
        System.out.println();
        gmailBox(); //if we want to create a new method from main block writeMethodName(); and click "create
        // method writeMethodName(); in className
    }

    public static void gmailBox() {
        openTheBrowser();
        navigateToHotmail();
        enterUsername();
        enterPassword();
        clickButton();
    }


    public static void openTheBrowser(){
        System.out.println("Opened the Chrome Browser");
    }
    public static void navigateToHotmail(){
        System.out.println("You opened the hotmail web site.");
    }
    public static void enterUsername(){
        System.out.println("you entered Faruk");
    }
    public static void enterPassword(){
        System.out.println("You entered the 12345 as password.");
    }
    public static void clickButton(){
        System.out.println("Now you are on dash board page.");
    }
    public static void hotmail(){
        openTheBrowser();
        navigateToHotmail();
        enterUsername();
        enterPassword();
        clickButton();
    }
}
