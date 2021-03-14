package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;// to join for REcyclerView and araylist
    private RecyclerView.LayoutManager mLayoutManager;// used for allign

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_bank,"Line 3","Line 4"));

        exampleList.add(new ExampleItem(R.drawable.ic_agri,"Line 512","Line 46"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_adb,"Line 15","Line 26"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_accessible_forward_24,"Line 25","Line 26"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_ic_call_24,"Line 15","Line 26"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Line 85","Line 63"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_add_business_24,"Line 65","Line 62"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_alarm_on_24,"Line 75","Line 67"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_anchor_24,"Line 635","Line 69"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_accessible_forward_24,"Line 25","Line 67"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_browser_not_supported_24,"Line 525","Line 746"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_ballot_24,"Line 5235","Line 56"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_adb,"Line 52","Line 63"));
        exampleList.add(new ExampleItem(R.drawable.ic_agri,"Line 50","Line 06"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_adjust_24,"Line 585","Line 64"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background,"Line 55","Line 685"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_adjust_24,"Line 525","Line 632"));
        exampleList.add(new ExampleItem(R.drawable.ic_baseline_alarm_on_24,"Line 552","Line 526"));

        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter((exampleList));
    mRecyclerView.setLayoutManager(mLayoutManager);
    mRecyclerView.setAdapter(mAdapter);
    }
}