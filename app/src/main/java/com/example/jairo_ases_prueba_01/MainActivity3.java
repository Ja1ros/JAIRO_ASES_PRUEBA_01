package com.example.jairo_ases_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText edDividendo;
    private EditText edDivisor;
    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dividendo = edDividendo.getText().toString();
                String divisor = edDivisor.getText().toString();

                Intent intent = new Intent(MainActivity3.this, MainActivity.class );

                // pasar informacion al activity
                intent.putExtra("dividendo",dividendo);
                intent.putExtra("divisor",divisor);

                Toast.makeText(getApplicationContext(),"Datos Ingresados",
                        Toast.LENGTH_LONG).show();

                startActivity(intent);

            }
        });
    }
}