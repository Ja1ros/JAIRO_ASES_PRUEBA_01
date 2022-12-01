package com.example.jairo_ases_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Button buttonNext = findViewById(R.id.buttonNext);
       buttonNext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent (v.getContext(), MainActivity3.class);
               startActivityForResult(intent, 0);
           }
       });

       Button buttonCerrar = findViewById(R.id.buttonCerrar);
       buttonCerrar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent (v.getContext(), MainActivity.class);
               startActivityForResult(intent, 0);
           }
       });
    }
}