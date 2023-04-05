package days.day55_REVIEW;

public class Pages {

    String pageWait = "Waitblabla";
    String navigateLinkElement = "....";

    public void navigationToPage(String pageName) {

        // bla
        // bla
        navigateTo(pageName);

    }

    public void clickChartMenu() {

    }

    public void navigateTo(String pageName) {
        // todo some automation
        System.out.println("NAVIGATED TO : " + pageName);
    }

    class  TestPages{
        public static void main(String[] args) {
            TaskPage taskPage = new TaskPage("e0001");
            taskPage.navigationToPage("Tasks");
        }
    }
}
