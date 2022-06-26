package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class use_Q5 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q5);
        num = (EditText) findViewById(R.id.etnum);
        click = (Button) findViewById(R.id.btClick);
        res =(TextView) findViewById(R.id.tvresult);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i,fact=1,n;
                n=Integer.parseInt(num.getText().toString());
                for(i=1;i<=n;i++)
                    fact = fact * i;
                res.setText("Factorial of "+n+" is: "+fact);
            }
        });
    }
}