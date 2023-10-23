package com.android.calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btSomar, btSubtrair, btMultiplicar, btDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSomar = findViewById(R.id.btSomar);
        btSubtrair = findViewById(R.id.btSubtrair);
        btMultiplicar = findViewById(R.id.btMultiplicar);
        btDividir = findViewById(R.id.btDividir);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectSoma = new Intent(MainActivity.this, SomarActivity.class);
                startActivity(redirectSoma);
            }
        });
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectSubtrair = new Intent(MainActivity.this, SubtrairActivity.class);
                startActivity(redirectSubtrair);
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectMultiplicar = new Intent(MainActivity.this, MultiplicarActivity.class);
                startActivity(redirectMultiplicar);
            }
        });
        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectDividir = new Intent(MainActivity.this, DividirActivity.class);
                startActivity(redirectDividir);
            }
        });
    }
}