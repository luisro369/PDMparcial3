package com.luisro00005513.pdmparcial3;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this, "Action home Clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_store:
                        Toast.makeText(MainActivity.this, "Action store Clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_account:
                        Toast.makeText(MainActivity.this, "Action account Clicked", Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }

        });
    }
}
