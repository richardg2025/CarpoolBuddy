package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import carpool.buddy.R;

public class AvailableVehiclesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_vehicles);
    }

    //nav methods
    public void navVehicleProfile(View v) {
        Intent intent = new Intent(this, VehicleProfileActivity.class);
        startActivity(intent);
    }

    public void navOtherPassengers(View v) {
        Intent intent = new Intent(this, OtherPassengersActivity.class);
        startActivity(intent);
    }


}