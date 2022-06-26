package com.example.codeguru;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class program_list extends Fragment
{


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_program_list, container, false);

        ListView java_prigram=view.findViewById(R.id.list);
        List<String> list=new ArrayList<>();
        list.add("1.Average and Percentage of 5 Subject.");
        list.add("2.Celsius to fahrenheit And tell you having fever or not.");
        list.add("3.Enter 2 Number Show Sum,Difference,Product.");
        list.add("4.Sum and Average of Even , Maximum number given by the user.");
        list.add("5.Find Factorial of the number.");
        list.add("6.Find Greater number in 3 input by user.");
        list.add("7.Find Power of any number.");
        list.add("8.Water Bill");
        list.add("9.Check weather the number is negative , positive and netural.");
        list.add("10.Find Area and Perimeter of rectangle.");
        list.add("11.Find the selling price of two discount 10 and 20.");
        list.add("12.square of greater number and cube of small number.");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.text_color,list);
        java_prigram.setAdapter(adapter);

        java_prigram.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Intent intent=new Intent(getActivity(),use_Q1.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent=new Intent(getActivity(),use_Q2.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent=new Intent(getActivity(),use_Q3.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent=new Intent(getActivity(),use_Q4.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent=new Intent(getActivity(),use_Q5.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent=new Intent(getActivity(),use_Q6.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent=new Intent(getActivity(),use_Q7.class);
                    startActivity(intent);
                }
                else if(position==7)
                {
                    Intent intent=new Intent(getActivity(),use_Q8.class);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}