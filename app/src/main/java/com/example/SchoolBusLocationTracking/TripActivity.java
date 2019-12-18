package com.example.SchoolBusLocationTracking;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TripActivity extends AppCompatActivity {
private EditText route, PickUp;
private Button buttoN;
DatabaseReference reference;
Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);
       PickUp= (EditText)findViewById(R.id.pickUp);
       route= (EditText)findViewById(R.id.Route);
       buttoN=(Button)findViewById(R.id.button);
       member=new Member();
       reference= FirebaseDatabase.getInstance().getReference().child("Member");
       buttoN.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               member.setRoute(route.getText().toString().trim());
               member.setPickUp(PickUp);
               reference.push().setValue(member);
               Toast.makeText(TripActivity.this, "Profile Updated Successfully", Toast.LENGTH_LONG).show();
           }
       });
    }

}
