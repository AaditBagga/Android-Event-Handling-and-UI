package com.example.evaluation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttoncalc;
    Button buttonreset;
    EditText editTextA;
    EditText editTextB;
    TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewAns = findViewById(R.id.textViewAns);
        buttoncalc = findViewById(R.id.buttoncalc);
        buttonreset = findViewById(R.id.buttonreset);

        buttoncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Double valueA = Double.valueOf(editTextA.getText().toString());
                    Double valueB = Double.valueOf(editTextB.getText().toString());
                    Double answer = valueA/valueB;
                    textViewAns.setText(answer.toString());

            }
        });


        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewAns.setText("N/A");
                editTextA.setText(" ");
                editTextB.setText(" ");
            }
        });



    }
}