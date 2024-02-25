package carpool.buddy.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import carpool.buddy.R;
import carpool.buddy.classes.User;

public class SignUpActivity extends AppCompatActivity {

    //declare variables
    private FirebaseAuth mAuth;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText nameInput;
    private CheckBox isTeacher;
    private CheckBox isStudent;
    private CheckBox isAlumni;
    private CheckBox isParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //declare and initialize variables
        mAuth = FirebaseAuth.getInstance();
        emailInput = findViewById(R.id.editTextEmail);
        passwordInput = findViewById(R.id.editTextPassword);
        nameInput = findViewById(R.id.editTextName);
        isAlumni = findViewById(R.id.checkBoxAlumni);
        isParent = findViewById(R.id.checkBoxParent);
        isStudent = findViewById(R.id.checkBoxStudent);
        isTeacher = findViewById(R.id.checkBoxTeacher);


    }

    //sign up method
    public void signUp(View v) {
        FirebaseUser currentUser = mAuth.getCurrentUser();

        //user input
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String name = nameInput.getText().toString();

        //create new user
        if (isTeacher.isActivated()) {
            User newUser = new User(email, name, "Teacher");
        } else if (isStudent.isActivated()) {
            User newUser = new User(email, name, "Student");
        } else if (isAlumni.isActivated()) {
            User newUser = new User(email, name, "Alumni");
        } else if (isParent.isActivated()) {
            User newUser = new User(email, name, "Parent");
        }

        //save user in firebase and sign in
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            Context context;
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                //sign up success, nav to main
                if(task.isSuccessful()) {
                    Toast messageToUser = Toast.makeText(context , "Success", Toast.LENGTH_LONG);
                    messageToUser.show();
                    Log.d("SIGN UP", "Successfully signed up");
                    FirebaseUser user = mAuth.getCurrentUser();
                    signedIn(user);
                }
                //sign up failed, toast user
                else {
                    Toast messageToUser = Toast.makeText(context, "Failed", Toast.LENGTH_LONG);
                    messageToUser.show();
                    Log.w("SIGN UP", "Failed to sign up",
                            task.getException());
                    signedIn(null);
                }
            }
        });
    }

    //user signed in, nav to main
    public void signedIn(FirebaseUser currentUser) {
        if(currentUser != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}