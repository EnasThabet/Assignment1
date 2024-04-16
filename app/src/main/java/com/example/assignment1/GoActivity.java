package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GoActivity extends AppCompatActivity {
  // private ImageButton btnBackClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
       // btnBackClick=btnBackClick.findViewById(R.id.backHome);
    }
    public void btnBackClick(View view){
        Intent intent=new Intent(GoActivity.this,Activity2.class);
        startActivity(intent);
    }

}