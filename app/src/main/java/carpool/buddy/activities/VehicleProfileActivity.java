package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import carpool.buddy.R;

public class VehicleProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_profile);
    }

    //nav methods
    public void navOtherPassengers(View v) {
        Intent intent = new Intent(this, OtherPassengersActivity.class);
        startActivity(intent);
    }
}