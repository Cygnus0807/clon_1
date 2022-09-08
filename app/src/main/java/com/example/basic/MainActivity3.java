package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {
    MaterialButton ffb,sfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ffb=findViewById(R.id.button1);
        sfb=findViewById(R.id.button2);

        MainActivity2.nm = "Asansol";

        ffb.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity3.this,"Clicked",Toast.LENGTH_LONG).show();
                replaceFragment(new chat_recycle());
            }
        });
        sfb.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
//                replaceFragment(new BlankFragment_2());
                Intent intent = new Intent(MainActivity3.this,recycler.class);
                intent.putExtra("abcd","Got it");
                startActivity(intent);
            }
        });

        ffb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity3.this,"AEC",Toast.LENGTH_LONG).show();
                return true;
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