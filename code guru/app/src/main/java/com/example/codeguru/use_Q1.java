package com.example.codeguru;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class use_Q1 extends AppCompatActivity
{
    EditText maths,english,hindi,science,it;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q1);

        String l="total";
        maths=(EditText)findViewById(R.id.etnum1);
        english=(EditText)findViewById(R.id.etnum2);
        science=(EditText)findViewById(R.id.etnum3);
        hindi=(EditText)findViewById(R.id.ethindi);
        it=(EditText)findViewById(R.id.etit);
        check=(Button)findViewById(R.id.btcheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m,e,h,s,i,tot,avg;
                m=Integer.parseInt(maths.getText().toString());
                e=Integer.parseInt(english.getText().toString());
                s=Integer.parseInt(science.getText().toString());
                h=Integer.parseInt(hindi.getText().toString());
                i=Integer.parseInt(it.getText().toString());
                tot=m+e+s+h+i;
                avg=tot/5;
                String l="total: ";
                String k="Percentage: ";
                openAlertBox(tot,l,k,avg);



            }
        });
    }


    private void openAlertBox(int n, String l,String k,int a) {
        AlertDialog.Builder builder = new AlertDialog.Builder(use_Q1.this);
        builder.setTitle("You Output");
        builder.setIcon(R.drawable.info);
        builder.setMessage(l+n+"\n"+k+a);
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