package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import carpool.buddy.R;
import carpool.buddy.classes.User;
import carpool.buddy.classes.PassengersAdapter;

public class DriverPassengersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_passengers);

        RecyclerView recyclerView = findViewById(R.id.passengersRecyclerView);

        List<User> passengers =

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PassengersAdapter(getApplicationContext(), passengers));


    }

    //nav methods
    public void navRatePassengers(View v) {
        //close vehicle
        Intent intent = new Intent(this, RatePassengersActivity.class);
        startActivity(intent);
        finish();
    }
}