package days.day51_Review;

import java.util.ArrayList;

public class Student {

    int number;
    String name;
    static int count;
    static ArrayList<String> nameList = new ArrayList<>();
    // science math Literature

    Student(String name) {
        this.name = name;
        count++;
        number++;
        nameList.add(name);
    }
}
