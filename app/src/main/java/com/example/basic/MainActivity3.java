package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {
    MaterialButton ffb,sfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ffb=findViewById(R.id.button1);
        sfb=findViewById(R.id.button2);

        ffb.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                replaceFragment(new BlankFragment1());
            }
        });
        sfb.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                replaceFragment(new BlankFragment_2());
            }
        });

    }
    private  void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout,fragment);
//        fragmentTransaction.commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
    }

}