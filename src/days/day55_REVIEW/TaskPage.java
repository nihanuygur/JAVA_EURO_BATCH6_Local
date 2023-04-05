package days.day55_REVIEW;

public class TaskPage extends Pages {
    String taskPageID;

    public TaskPage(String taskPageID) {
        this.taskPageID = taskPageID;

    }


    public void navigationToPage(String pageName) {

        super.navigationToPage(pageName + taskPageID);
    }
}
