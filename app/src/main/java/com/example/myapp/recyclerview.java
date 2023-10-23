package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recyclerview extends AppCompatActivity {

    ArrayList<contact> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        RecyclerView recyclerView = findViewById(R.id.recScreen);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new contact(R.drawable.image6, "Usama Basharat", "bitf20m528"));
        arrContacts.add(new contact(R.drawable.image6, "Taimoor Ali", "bitf20m530"));
        arrContacts.add(new contact(R.drawable.image6, "Muhammad Ahmad", "bitf20m534"));
        arrContacts.add(new contact(R.drawable.image6, "Ahmad Ali", "bitf20m544"));
        arrContacts.add(new contact(R.drawable.image6, "Hammad Tahir", "bitf20m540"));
        arrContacts.add(new contact(R.drawable.image6, "Laraib Sheikh", "bitf20m551"));
        arrContacts.add(new contact(R.drawable.image6, "Zeeshan Nazir", "bitf20m547"));
        arrContacts.add(new contact(R.drawable.image6, "Maqbool Bhai", "bitf20m524"));
        arrContacts.add(new contact(R.drawable.image6, "Husnain Malhi", "bitf20m539"));
        arrContacts.add(new contact(R.drawable.image6, "Muhammad Asad", "bitf20m533"));


        adaptor adaptor = new adaptor(this, arrContacts);
        recyclerView.setAdapter(adaptor);
    }
}