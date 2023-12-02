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

        arrContacts.add(new contact(R.drawable.img, "Usama Basharat", "bitf20m528@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Taimoor Ali", "bitf20m530@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "M Ahmad", "bitf20m534@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Ahmad Ali", "bitf20m544@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Hammad Tahir", "bitf20m540@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Laraib Sheikh", "bitf20m551@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Zeeshan Nazir", "bitf20m547@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Maqbool Bhai", "bitf20m524@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Husnain Malhi", "bitf20m539@gmail.com"));
        arrContacts.add(new contact(R.drawable.img, "Muhammad Asad", "bitf20m533@gmail.com"));


        adaptor adaptor = new adaptor(this, arrContacts);
        recyclerView.setAdapter(adaptor);
    }
}