package com.android.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class SomarActivity extends AppCompatActivity {
    Button btSomar, btVoltar;
    EditText num1, num2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somar);

        btVoltar = findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirectMain = new Intent(SomarActivity.this, MainActivity.class);
                startActivity(redirectMain);
            }
        });

        num1 = findViewById(R.id.edtNum1);
        num2 = findViewById(R.id.edtNum2);
        resultado = findViewById(R.id.edtResultado);
        btSomar = findViewById(R.id.btSomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = num1.getText().toString();
                String valor2 = num2.getText().toString();

                if (TextUtils.isEmpty(valor1)) {
                    valor1 = "0";
                }
                if (TextUtils.isEmpty(valor2)) {
                    valor2 = "0";
                }

                float soma = Float.parseFloat(valor1) + Float.parseFloat(valor2);
                resultado.setText(String.valueOf(soma));
            }
        });
    }
}