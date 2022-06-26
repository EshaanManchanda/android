package com.example.codeguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    private long backPressedTime;
    private Toast backtoast;
    private TabLayout tb;
    private ViewPager vp;

    @Override
    public void onBackPressed() {

        if(backPressedTime+2000>System.currentTimeMillis())
        {
            backtoast.cancel();
//            super.onBackPressed();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
            return;
        }
        else
        {
            backtoast=Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
            backtoast.show();
        }
        backPressedTime=System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tablay1);
        vp = findViewById(R.id.viewPager);

        tb.setupWithViewPager(vp);
        Vpadapter vpadp= new Vpadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );
        vpadp.addfragment(new home(),"Home");
        vpadp.addfragment(new language_list(),"Languages");
        vpadp.addfragment(new program_list(),"Programs");

        vp.setAdapter(vpadp);

    }
}