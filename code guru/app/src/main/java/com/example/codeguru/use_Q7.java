package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class use_Q7 extends AppCompatActivity {
    EditText num,power;
    TextView result;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q7);
        num=(EditText) findViewById(R.id.etnum1);
        power=(EditText) findViewById(R.id.etnum2);
        result=(TextView) findViewById(R.id.tvresult);
        check=(Button) findViewById(R.id.btcheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n,pow,i,k=1;
                n=Integer.parseInt(num.getText().toString());
                pow=Integer.parseInt(power.getText().toString());
                for(i=1;i<=pow;i++)
                {
                    k=k*n;
                }
                result.setText("Answer: "+k);
            }
        });
    }
}