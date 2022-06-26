package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class java_Q8 extends AppCompatActivity {
    Button tcopy;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_q8);
        tcopy = (Button) findViewById(R.id.btclipbord);
        text = (TextView) findViewById(R.id.t7);
        tcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipbord=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("copy text",text.getText().toString());
                clipbord.setPrimaryClip(clip);
                Toast.makeText(java_Q8.this,"Copied",Toast.LENGTH_SHORT).show();

            }
        });
    }
}