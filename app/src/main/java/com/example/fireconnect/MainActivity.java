package com.example.fireconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private void make_hello_world(){
        FirebaseDatabase database = FirebaseDatabase.getInstance("https://fireconnect-8bec7-default-rtdb.europe-west1.firebasedatabase.app/");

        DatabaseReference myRef = database.getReference("message");

        Date currenTime = Calendar.getInstance().getTime();
        String m = "Hallo wereld .. de tijd is:" + currenTime.toString();

        myRef.setValue(m);

        Toast.makeText(getApplicationContext(), "Melding:" + m, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}