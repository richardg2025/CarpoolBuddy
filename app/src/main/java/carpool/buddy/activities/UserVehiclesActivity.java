package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import carpool.buddy.R;
import carpool.buddy.classes.UserVehiclesAdapter;
import carpool.buddy.classes.Vehicle;

public class UserVehiclesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_vehicles);

        RecyclerView recyclerView = findViewById(R.id.vehiclesRecyclerView);

        List<Vehicle> vehicles =

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserVehiclesAdapter(getApplicationContext(), vehicles));

    }




    //nav methods
    public void navDriverPassengers(View v) {
        Intent intent = new Intent(this, DriverPassengersActivity.class);
        startActivity(intent);
    }

    public void navAddVehicle(View v) {
        Intent intent = new Intent(this, AddVehicleActivity.class);
        startActivity(intent);
    }
}