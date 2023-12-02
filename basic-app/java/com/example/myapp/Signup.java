package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    private EditText editTextFullName;
    private EditText editTextEmail;
    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextFullName = findViewById(R.id.textFullName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextUsername = findViewById(R.id.textUserName);
        editTextPassword = findViewById(R.id.editTextPassword);

        Button signupButton = findViewById(R.id.buttonSignUp);
        Button gotoLoginButton = findViewById(R.id.buttonSignIn);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the values from the EditText fields
                String fullName = editTextFullName.getText().toString();
                String email = editTextEmail.getText().toString();
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Check if any field is empty
                if (fullName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Fields are filled, pass data to the login activity
                    Intent intent = new Intent(Signup.this, Signin.class);
                    intent.putExtra("fullName", fullName);
                    intent.putExtra("email", email);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                    finish();
                }
            }
        });

        gotoLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When "Log In" button is clicked, open LoginActivity
                Intent intent = new Intent(Signup.this, Signin.class);
                startActivity(intent);
            }
        });
    }
}
//public class Signup extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signup);
//
//        Button SigninButton = findViewById(R.id.buttonSignIn);
//        SigninButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Start the SignInActivity when "Signin" is clicked
//                Intent intent = new Intent(Signup.this, Signin.class);
//                startActivity(intent);
//            }
//        });
//    }
//}
