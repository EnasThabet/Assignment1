package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private Button go;
EditText UserName;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName=findViewById(R.id.UserName);

    }
    public void btnGoOnclick(View view){
        Intent intent=new Intent(MainActivity.this,LoadingActivity.class);
name=UserName.getText().toString();
intent.putExtra("Name",name);
startActivity(intent);
finish();

    }
}