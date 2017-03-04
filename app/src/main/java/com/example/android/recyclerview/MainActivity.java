package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.example.android.recyclerview.*;

import static android.R.id.tabs;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TabLayout tabs;
    CollapsingToolbarLayout collapsingToolbarLayout;
    RecyclerView.Adapter adapter;
    String[] Data= new String[]{"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5"
                                ,"Elemento 6", "Elemento 7","Elemento 8","Elemento 9","Elemento 10"
            ,"Elemento 6", "Elemento 7","Elemento 8","Elemento 9","Elemento 10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        collapsingToolbarLayout.setTitle("JAIR BARZOLA ");
/* TABS
        tabs = (TabLayout) findViewById(R.id.tab);
        tabs.setTabMode(TabLayout.MODE_FIXED);
        tabs.addTab(tabs.newTab().setText("Tab 1"));
        tabs.addTab(tabs.newTab().setText("Tab 2"));
        tabs.addTab(tabs.newTab().setText("Tab 3"));
        tabs.addTab(tabs.newTab().setText("Tab 4"));
   */

        //pasos para crear el recycler view
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //creamos el adapter
        adapter = new RecyclerAdapter(Data);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
