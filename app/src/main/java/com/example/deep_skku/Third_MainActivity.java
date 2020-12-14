package com.example.deep_skku;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Third_MainActivity extends AppCompatActivity implements View.OnClickListener{
    FragmentManager manager;
    FragmentTransaction ft;

    FragmentOne2 fragmentOne;
    FragmentTwo2 fragmentTwo;
    FragmentThree2 fragmentThree;

    LinearLayout camera_enter_btn;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity_main);

        manager = getSupportFragmentManager();

        fragmentOne = new FragmentOne2();
        fragmentTwo = new FragmentTwo2();
        fragmentThree = new FragmentThree2();


        LinearLayout one = findViewById(R.id.one);
        LinearLayout two = findViewById(R.id.two);
        LinearLayout three = findViewById(R.id.three);

        TextView one2 = findViewById(R.id.one2);
        TextView two2 = findViewById(R.id.two2);
        TextView three2 = findViewById(R.id.three2);

        ft = manager.beginTransaction();
        if(MainActivity.fragment_switch==1){
            one2.setBackgroundColor(Color.rgb(149,188,242));
            MainActivity.fragment_switch=0;
            ft.add(R.id.fragment_container, fragmentOne);}
        else if(MainActivity.fragment_switch==2){
            two2.setBackgroundColor(Color.rgb(149,188,242));
            MainActivity.fragment_switch=0;
            ft.add(R.id.fragment_container, fragmentTwo);}
        else if(MainActivity.fragment_switch==3){
            three2.setBackgroundColor(Color.rgb(149,188,242));
            MainActivity.fragment_switch=0;
            ft.add(R.id.fragment_container, fragmentThree);}
        ft.addToBackStack(null);
        ft.commit();

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
    }


    public void onClick(View v) {
        ft = manager.beginTransaction();

        TextView one2 = findViewById(R.id.one2);
        TextView two2 = findViewById(R.id.two2);
        TextView three2 = findViewById(R.id.three2);

        one2.setBackgroundColor(Color.WHITE);
        two2.setBackgroundColor(Color.WHITE);
        three2.setBackgroundColor(Color.WHITE);
        int id = v.getId();
        switch (id) {
            case R.id.one:
                one2.setBackgroundColor(Color.rgb(149,188,242));
                ft.replace(R.id.fragment_container, fragmentOne);
                ft.commit();
                break;
            case R.id.two:
                two2.setBackgroundColor(Color.rgb(149,188,242));
                ft.replace(R.id.fragment_container, fragmentTwo);
                ft.commit();
                break;
            case R.id.three:
                three2.setBackgroundColor(Color.rgb(149,188,242));
                ft.replace(R.id.fragment_container, fragmentThree);
                ft.commit();
                break;
        }
        }
    }
