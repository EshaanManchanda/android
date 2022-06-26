package com.example.codeguru;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class use_Q8 extends AppCompatActivity {

    EditText lastR,CurrentR,Numofdays;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_q8);

    lastR=(EditText)findViewById(R.id.lastR);
    CurrentR=(EditText)findViewById(R.id.currentR);
    Numofdays=(EditText)findViewById(R.id.numofday);
    check=(Button)findViewById(R.id.check);

    check.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int r=0,sr=667,d=0,rs=0,s,e;
            String k;
            int lr=Integer.parseInt(lastR.getText().toString());
            int cr=Integer.parseInt(CurrentR.getText().toString());
            int nod=Integer.parseInt(Numofdays.getText().toString());
            r=cr-lr;
            e=r*1000;
            d=nod*sr;
            rs=e-d;
            if(rs<=0)
            {
                s=0;
                k="Free hai";
                openAlertBox(s,k);
            }
            else
            {

                rs=r*23;
                s=rs;
                k="Bill jyada hai ";
                openAlertBox(s,k);
            }

        }
    });
    }
    private void openAlertBox(int n, String l) {
        AlertDialog.Builder builder = new AlertDialog.Builder(use_Q8.this);
        builder.setTitle("You Output");
        builder.setIcon(R.drawable.info);
        builder.setMessage(l+" : "+n);
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