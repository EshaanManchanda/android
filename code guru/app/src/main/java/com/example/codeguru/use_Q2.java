package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class use_Q2 extends AppCompatActivity {
    TextView result;
    EditText temp;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q2);
        result = (TextView) findViewById(R.id.tvresult);
        temp=(EditText)findViewById(R.id.ettemp);
        check=(Button)findViewById(R.id.btcheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double fah;
                Double cel = Double.parseDouble(temp.getText().toString());
                fah=(cel*9/5)+32;
                if(fah>98.6)
                {
                    result.setText("You Having Fever!");
                }
                else
                {
                    result.setText("You are Normal.");
                }


            }
        });
    }
}