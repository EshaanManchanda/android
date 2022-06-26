package com.example.codeguru;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class use_Q3 extends AppCompatActivity {
    EditText n1,n2;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q3);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        check=(Button)findViewById(R.id.btcheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,diff,pro,sum;
                String s1="Sum: ",s2="Difference: ",s3="Product: ";
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());
                sum=a+b;
                pro=a*b;
                if(a>b)
                {
                    diff=a-b;
                }
                else
                {
                    diff=b-a;
                }
                openAlertBox(s1,sum,s2,diff,s3,pro);


            }
        });
    }
    private void openAlertBox(String k1,int a,String k2,int b,String k3,int c) {
        AlertDialog.Builder builder = new AlertDialog.Builder(use_Q3.this);
        builder.setTitle("You Output");
        builder.setIcon(R.drawable.info);
        builder.setMessage(k1+a+"\n"+k2+b+"\n"+k3+c);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}