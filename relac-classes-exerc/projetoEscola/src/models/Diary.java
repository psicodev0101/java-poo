package models;

import java.util.ArrayList;

public class Diary {

    private final ArrayList<String> activities;

    public Diary() {
        this.activities = new ArrayList<>();
    }

    public void recordActivity(String activity) {
        activities.add(activity);
    }

}
