package com.luisro00005513.pdmparcial3;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Fragments.Account_User;
import com.luisro00005513.pdmparcial3.Fragments.Home_Magi;
import com.luisro00005513.pdmparcial3.Fragments.Home_YGH;
import com.luisro00005513.pdmparcial3.Fragments.Store_auction;

public class MainActivity extends AppCompatActivity {

    private Home_YGH home_ygh;
    private Store_auction store_auction;
    private Account_User account_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_ygh = new Home_YGH();
        store_auction = new Store_auction();
        account_user = new Account_User();

        final BottomNavigationView mMainNav = findViewById(R.id.bottom_navigation);
        FrameLayout mMainFrame = findViewById(R.id.main_frame);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        setFrament(home_ygh);
                        Toast.makeText(MainActivity.this, "Action home Clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_store:
                        setFrament(store_auction);
                        Toast.makeText(MainActivity.this, "Action store Clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_account:
                        setFrament(account_user);
                        Toast.makeText(MainActivity.this, "Action account Clicked", Toast.LENGTH_LONG).show();
                        return true;

                        default:
                            return false;
                }
            }

        });
    }

    private void setFrament(Fragment frament) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, frament);
        fragmentTransaction.commit();
    }
}
