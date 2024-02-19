package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import carpool.buddy.R;
import carpool.buddy.classes.User;
import carpool.buddy.classes.PassengersAdapter;

public class OtherPassengersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_passengers);

        RecyclerView recyclerView = findViewById(R.id.otherPassengersRecyclerView);

        List<User> passengers =

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PassengersAdapter(getApplicationContext(), passengers));
    }
}