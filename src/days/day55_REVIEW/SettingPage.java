package days.day55_REVIEW;

public class SettingPage extends Pages {
    String settingPageID;

    public SettingPage(String settingPageID) {
        this.settingPageID = settingPageID;

    }


    public void navigationToPage(String pageName) {

        super.navigationToPage(pageName + settingPageID);
    }
}
