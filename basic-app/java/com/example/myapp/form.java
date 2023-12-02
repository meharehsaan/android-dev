package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.R;

public class form extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextDescription;
    private Button buttonSave;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTextName = findViewById(R.id.editTextName);
        editTextDescription = findViewById(R.id.editTextDescription);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String description = editTextDescription.getText().toString();

                // Create an Intent to pass data back to the main activity
                Intent data = new Intent();
                data.putExtra("name", name);
                data.putExtra("description", description);

                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}