package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etTempC;
    Button btConverter, btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTempC = findViewById(R.id.etTempC);
        btConverter = findViewById(R.id.btConverter);
        btLimpar = findViewById(R.id.btLimpar);

        btConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double tempC = Double.parseDouble(etTempC.getText().toString());
                    double tempF = tempC * 1.8 +32;
                    etTempC.setText(String.valueOf(tempF));
                }catch (NumberFormatException erro){
                    etTempC.setHint("Digite uma temperatura!");
                }

            }
        });
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTempC.setText("");
            }
        });

    }
}