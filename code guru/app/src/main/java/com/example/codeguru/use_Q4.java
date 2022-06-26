package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class use_Q4 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q4);
        num = (EditText) findViewById(R.id.etnum);
        click = (Button) findViewById(R.id.btClick);
        res =(TextView) findViewById(R.id.tvresult);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i, a = 0, c = 0, n, avg;
                n=Integer.parseInt(num.getText().toString());
                for(i=1;i<=n;i++)
                {
                    if(i%2==0)
                    {
                        a=a+i;
                        c=c+1;
                    }
                }
                avg=a/c;
                res.setText("Sum: "+a+"\nAverage: "+avg);
            }
        });
    }
}