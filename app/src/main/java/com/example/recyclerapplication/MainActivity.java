package com.example.recyclerapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecylerView();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.rice, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.others1, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.others2, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.rice, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.others2, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.others1, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.maixe, "John Doe", "10:20AM", "Hi , John", "_____________________________________________________________________"));
    }

    private void initRecylerView() {
        recyclerView = findViewById(R.id.myrecyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}