package com.example.SchoolBusLocationTracking;
import android.widget.EditText;

public class Member {
    private String route, name;
    private EditText pickUp;

    public Member() {
    }
    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public EditText getPickUp() {
        return pickUp;
    }
    public void setPickUp(EditText pickUp) {
        this.pickUp = pickUp;
    }
}

