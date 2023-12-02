package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int NOTIFICATION_ID = 100;
    public static final String CHANNEL_SIMPLE_NOTIFICATION = "My Channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting Name
        Bundle bundle = getIntent().getExtras();
        String name = "Ehsaan";
        if(bundle!= null){
            name = bundle.getString("name", "Ehsaan");
        }

        //Setting my own Name
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome Back "+ name);
        setSupportActionBar(toolbar);

        //  <--------------- Recycler View ---------------------------->

        Button recbutton = findViewById(R.id.btnRecyclerView);
        recbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), recyclerview.class);
                startActivity(i);
            }
        });

        //  <--------------- Shared Preference ---------------------------->

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button sp = findViewById(R.id.sharedp);
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), sharedp.class);
                startActivity(i);
            }
        });

        //  <--------------- Dynamic Fragments ---------------------------->

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button frag = findViewById(R.id.dynamicfragments);
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), dynfrag.class);
                startActivity(i);
            }
        });

        //  <--------------- Calculator ---------------------------->

        Button cal = findViewById(R.id.calculator);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), calculator.class);
                startActivity(i);
            }
        });

        //  <--------------- Form ---------------------------->

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button form = findViewById(R.id.form);
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), form.class);
                startActivity(i);
            }
        });

        //  <--------------- Toast message ---------------------------->

        Button toast = findViewById(R.id.toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Hello! I Ehsaan showing this toast message to you!";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast to = Toast.makeText(context, message, duration);
                to.show();
            }
        });

        //  <---------------   Notification and dialog box   ---------------------------->

        Button notifyButton = findViewById(R.id.notifybutton);
        notifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNotification();
            }
        });

        Button dialogButton = findViewById(R.id.dialog_button);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogBox();
            }
        });

    }

    //  <--------------- Function sendNotification ---------------------------->
    public  void sendNotification(){
        //Notification management
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.img, null);
        BitmapDrawable bitmapDrawable;
        bitmapDrawable = (BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();
        Notification simpleNotification;
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            simpleNotification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.img)
                    .setContentText("Custom Notification")
                    .setSubText("Notification from app created successfully")
                    .setChannelId(CHANNEL_SIMPLE_NOTIFICATION)
                    .build();
            nm.createNotificationChannel(new NotificationChannel(CHANNEL_SIMPLE_NOTIFICATION, "My Channel", NotificationManager.IMPORTANCE_HIGH));
        } else {
            simpleNotification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.img)
                    .setContentText("Custom Notification")
                    .setSubText("Notification from app created successfully")
                    .build();
        }
        nm.notify(NOTIFICATION_ID, simpleNotification);
    }

    //  <--------------- Function Dialog Box ---------------------------->
    public void dialogBox(){
        Dialog dialog1 = new Dialog(this);
        dialog1.setContentView(R.layout.custom_dialog);
        dialog1.setCancelable(true);
        dialog1.show();

//        Button okButton = findViewById(R.id.okButton);
//        okButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog1.dismiss();
//            }
//        });

    }

}