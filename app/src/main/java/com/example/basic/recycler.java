package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class recycler extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter adapter;

    ArrayList<MyData> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(recycler.this);

        data.add(new MyData("Pranav","My name is Pranav","https://images.squarespace-cdn.com/content/v1/515ec70ae4b03ae0a116ea30/1481817184423-U39LEHA03SNS8MRXN36R/image-asset.png?format=1000w"));
        data.add(new MyData("sor","My name is sor","https://source.unsplash.com/random"));
        data.add(new MyData("akash","My name is akash","https://source.unsplash.com/random"));
        data.add(new MyData("akanshu","My name is akanshu","https://source.unsplash.com/random"));
        data.add(new MyData("hello","My name is hello","https://source.unsplash.com/random"));
        data.add(new MyData("hiii","My name is hiiii","https://source.unsplash.com/random"));
        data.add(new MyData("nee","My name is nee","https://source.unsplash.com/random"));
        data.add(new MyData("bye","My name is bye","https://source.unsplash.com/random"));

        adapter = new RecyclerAdapter(recycler.this,data);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}