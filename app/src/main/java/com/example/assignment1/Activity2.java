package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ListView listview=findViewById(R.id.ListView);
        List<String>options=new ArrayList<>();
        options.add("Rectangle");
        options.add("Square");
        options.add("Circle");
        options.add("Triangle");

        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,options);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Activity2.this,GoActivity.class));
                }else   if(position==1){
                    startActivity(new Intent(Activity2.this,Activity3.class));
                }else   if(position==2){
                    startActivity(new Intent(Activity2.this,Activity4.class));
                }else   if(position==3){
                    startActivity(new Intent(Activity2.this,Activity5.class));
                }

            }
        });

    }
    public void btnBackClick(View view){
        Intent intent=new Intent(Activity2.this,MainActivity.class);
        startActivity(intent);
    }
}