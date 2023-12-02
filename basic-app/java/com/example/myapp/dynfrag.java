package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class dynfrag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynfrag);

        // Load the initial FormFragment
        if (savedInstanceState == null) {
            loadFormFragment();
        }
    }

    public void loadFormFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.formFragmentContainer, FormFragment.newInstance())
                .commit();
    }

    public void loadListFragment(String name, String country) {
        ListFragment listFragment = ListFragment.newInstance(name, country);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.listFragmentContainer, listFragment)
                .commit();
    }
}