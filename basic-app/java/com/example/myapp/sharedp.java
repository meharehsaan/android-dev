package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class sharedp extends AppCompatActivity {

    private static final String PREFERENCE_NAME = "Ehsaan Khaliq";
    private static final String KEY_USERNAME = "username";

    private EditText editTextUsername;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);

        // Load the saved username when the activity is created
        loadUsername();
    }

    // Save the username to SharedPreferences
    private void saveUsername(String username) {
        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_USERNAME, username);
        editor.apply();
    }

    // Load the username from SharedPreferences and set it to the EditText
    private void loadUsername() {
        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        String username = preferences.getString(KEY_USERNAME, "");
        editTextUsername.setText(username);
    }

    private void onSaveButtonClick() {
        String username = editTextUsername.getText().toString().trim();
        saveUsername(username);
    }
}
