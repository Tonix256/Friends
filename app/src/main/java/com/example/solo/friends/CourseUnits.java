package com.example.solo.friends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CourseUnits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_units);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String [] tribedetails={
                "Mobile Application programming",
                "Database Programming",
                "Research Methods",
                "Software Development",
                "Business Intelligence"

        };
        ListView tb=(ListView)findViewById(R.id.t);
        ListAdapter yt=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tribedetails);
        tb.setAdapter(yt);
        tb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String k = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(CourseUnits.this, k, Toast.LENGTH_LONG).show();
            }
        });
    }

}
