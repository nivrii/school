package com.example.SchoolBusLocationTracking;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.model.LatLng;
public class Stop extends AppCompatActivity {

    private String mName;
    private LatLng mLatLong;

    public Stop(String name, LatLng latLong) {
        this.mName = name;
        this.mLatLong = latLong;
    }

    public String getName() {
        return mName;
    }

    public LatLng getLatLong() {
        return mLatLong;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
    }
}
