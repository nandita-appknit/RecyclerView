package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.LinearLayout;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private List<String> list;
    //private RecyclerView.ViewHolder viewHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        list= Arrays.asList(getResources().getStringArray(R.array.versions));
        adapter=new recyclerAdapter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);



    }
}
