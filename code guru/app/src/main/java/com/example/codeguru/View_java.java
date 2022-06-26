package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class View_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_java);

        ListView java_prigram=findViewById(R.id.list);
        List<String> list=new ArrayList<>();
        list.add("1.Avrage and Percentage of 5 Subject.");
        list.add("2.Celsius to fahrenheit And tell you havign fever or not.");
        list.add("3.Enter 2 Number Show Sum,Difference,Product.");
        list.add("4.Sum and Avrage of Even , Maximum number given by the user.");
        list.add("5.Find Factorial of the number.");
        list.add("6.Find Greater number in 3 input by user.");
        list.add("7.Find total Salary when we have the some charges.");
        list.add("8.Find the selleing price after discount.");
        list.add("9.Check weather the number is negative , positive and netural.");
        list.add("10.Find Area and Perimeter of rectangle.");
        list.add("11.Find the selling price of two discount 10 and 20.");
        list.add("12.square of greater number and cube of small number.");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.text_color,list);
        java_prigram.setAdapter(adapter);
        java_prigram.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent=new Intent(View_java.this,Q1.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent=new Intent(View_java.this,java_Q2.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent=new Intent(View_java.this,java_Q3.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent=new Intent(View_java.this,java_Q4.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent=new Intent(View_java.this,java_Q5.class);
                    startActivity(intent);
                }else if(position==5)
                {
                    Intent intent=new Intent(View_java.this,java_Q6.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent=new Intent(View_java.this,java_Q7.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    Intent intent=new Intent(View_java.this,java_Q8.class);
                    startActivity(intent);
                }
                else if(position==8)
                {
                    Intent intent=new Intent(View_java.this,java_Q9.class);
                    startActivity(intent);
                }
                else if(position==9)
                {
                    Intent intent=new Intent(View_java.this,java_Q10.class);
                    startActivity(intent);
                }
                else if(position==10)
                {
                    Intent intent=new Intent(View_java.this,java_Q11.class);
                    startActivity(intent);
                }
                else if(position==11)
                {
                    Intent intent=new Intent(View_java.this,java_Q12.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Somthing Went wrong please try again later!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}