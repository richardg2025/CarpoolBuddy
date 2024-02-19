package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import carpool.buddy.R;

public class OpenVehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_vehicle);
    }

    //nav methods
    public void navUserVehicles(View v) {
        Intent intent = new Intent(this, UserVehiclesActivity.class);
        startActivity(intent);
    }
}