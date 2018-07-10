package com.luisro00005513.pdmparcial3;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Adapter.ViewPagerAdapter;
import com.luisro00005513.pdmparcial3.Fragments.Home_YGH;
import com.luisro00005513.pdmparcial3.Fragments.Store_auction;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Home_YGH(),"Home");
        viewPagerAdapter.addFragment(new Store_auction(), "Transfer");

        NavBottom();

    }

    public void NavBottom(){
        BottomNavigationView mMainNav = findViewById(R.id.bottom_navigation);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:

                        Toast.makeText(MainActivity.this, "Action home Clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_store:

                        Toast.makeText(MainActivity.this, "Action store Clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_account:

                        Toast.makeText(MainActivity.this, "Action account Clicked", Toast.LENGTH_LONG).show();
                        return true;

                    default:
                        return false;
                }
            }

        });
    }

}
