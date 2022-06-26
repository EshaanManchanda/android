
package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class use_Q6 extends AppCompatActivity {
    EditText num1,num2,num3;
    TextView result;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q6);
        num1 = (EditText) findViewById(R.id.etnum1);
        num2 = (EditText) findViewById(R.id.etnum2);
        num3 = (EditText) findViewById(R.id.etnum3);
        result = (TextView) findViewById(R.id.tvresult);
        check=(Button) findViewById(R.id.btcheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=Integer.parseInt(num3.getText().toString());
                if (n1 > n2 && n1 > n3) {
                    result.setText(n1 + " is grater");
                } else if (n2 > n3) {
                    result.setText(n2 + " is grater");
                } else if (n3 > n1 && n3 > n2) {
                    result.setText(n3 + " is grater");
                } else {
                    result.setText("All are Equal");
                }
            }
        });
    }
}