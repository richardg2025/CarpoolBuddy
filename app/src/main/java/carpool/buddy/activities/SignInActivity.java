package carpool.buddy.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.AuthResult;

import carpool.buddy.R;

public class SignInActivity extends AppCompatActivity {

    //declare variables
    private FirebaseAuth mAuth;
    private EditText emailInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //declare and initialize variables
        mAuth = FirebaseAuth.getInstance();
        emailInput = findViewById(R.id.editTextEmail);
        passwordInput = findViewById(R.id.editTextPassword);

    }

    //sign in method
    public void signIn(View v) {
        FirebaseUser currentUser = mAuth.getCurrentUser();

        //user input
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        //sign in using user input
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //sign in success, nav to main
                            Log.d("SIGN IN", "signInWithEmail: success");
                            signedIn(currentUser);
                        }
                        else {
                            //sign in failed, display message to user
                            Log.w("SIGN IN", "signInWithEmail: failure", task.getException());
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