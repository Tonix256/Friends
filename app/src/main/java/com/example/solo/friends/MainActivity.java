package com.example.solo.friends;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    Fragment christ;
    FragmentManager chst=getFragmentManager();
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void  firsttouch(View view){
        christ=new frag1();
        fragmentTransaction=chst.beginTransaction();
        fragmentTransaction.replace(R.id.content_main, christ);
        fragmentTransaction.commit();
    }
    public void  secondtouch(View view){
        christ=new frag3();
        fragmentTransaction=chst.beginTransaction();
        fragmentTransaction.replace(R.id.content_main,christ);
        fragmentTransaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.courses) {
            Intent u=new Intent(this,CourseUnits.class);
            startActivity(u);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
