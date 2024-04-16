package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoadingActivity extends AppCompatActivity {
Handler handle;

    TextView userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        userName=findViewById(R.id.userName);
     handle=new Handler();
     handle.postDelayed(new Runnable() {
         @Override
         public void run() {

             Intent intent=new Intent(LoadingActivity.this,Activity2.class);
             String name=getIntent().getExtras().getString("Name");
             userName.setText(name);
             startActivity(intent);
finish();
         }
     },3000);
    }
}