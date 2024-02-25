package carpool.buddy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import carpool.buddy.R;

public class UserProfileActivity extends AppCompatActivity {

    //declare variables
    private String uid;
    private String name;
    private String userType;
    private int rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        //declare and initialize variables
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView1 = findViewById(R.id.name);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView2 = findViewById(R.id.userType);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView3 = findViewById(R.id.email);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView4 = findViewById(R.id.uid);

        FirebaseFirestore fireStore = FirebaseFirestore.getInstance();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        assert currentUser != null;
        String email = currentUser.getEmail();
    }

    //nav methods
    public void navUserVehicles(View v) {
        Intent intent = new Intent(this, UserVehiclesActivity.class);
        startActivity(intent);
    }

    public void navAuth(View v) {
        //signout
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
        finish();
    }
}