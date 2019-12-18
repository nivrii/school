package com.example.SchoolBusLocationTracking;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity  {
    private Button trackBtn, btnProfile, btnMessage, btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initializeViews();
    }
    public void initializeViews() {
        trackBtn = findViewById(R.id.trackSchool);
        btnMaps = findViewById(R.id.btnMap);
        btnMessage = findViewById(R.id.btnMess);
        btnProfile = findViewById(R.id.btnProf);
    }
    public void onButtonClick(View v) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(intent);

        trackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ProActivity.class);
                startActivity(intent);
            }
        });
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ProActivity.class);
                startActivity(intent);
            }
        });
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, TripActivity.class);
                startActivity(intent);
            }
        });
    }
}