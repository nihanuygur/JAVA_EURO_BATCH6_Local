package days.day55TalhaT;

public class SettingPage extends Pages {

    String settingPageID ;

    public SettingPage(String settingPageID) {
        this.settingPageID = settingPageID;
    }

    @Override
    public void navigationToPage(String pageName) {
        super.navigationToPage(pageName+settingPageID);
    }
}
