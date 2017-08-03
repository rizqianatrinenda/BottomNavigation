package com.example.rizqi.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivityBottomNavigation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bottom_navigation);
        //set default fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment1()).commit();


        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Fragment1 fragment1 = new Fragment1();
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment1).commit();
                return true;

                }
                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        Fragment2 fragment2 = new Fragment2();
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment2).commit();
                        return  true;
                }
                switch (item.getItemId()) {
                    case R.id.navigation_notif:
                        Fragment3 fragment3 = new Fragment3();
                        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment3).commit();
                        return true;
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_bottom_navigation, menu);
        return true;
    }


}
