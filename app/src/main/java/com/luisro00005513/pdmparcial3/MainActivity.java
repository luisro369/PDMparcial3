package com.luisro00005513.pdmparcial3;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Adapter.ViewPagerAdapter;
import com.luisro00005513.pdmparcial3.Fragments.FragmentLogin;
import com.luisro00005513.pdmparcial3.Fragments.Fragment_Home;
import com.luisro00005513.pdmparcial3.Fragments.Home_Magi;
import com.luisro00005513.pdmparcial3.Fragments.Home_YGH;
import com.luisro00005513.pdmparcial3.Fragments.Store_auction;
import com.luisro00005513.pdmparcial3.Fragments.Store_buy;

public class MainActivity extends AppCompatActivity implements
        Fragment_Home.OnFragmentInteractionListener{

    public Fragment fragment_Home= new Fragment_Home();
    public Fragment fragment_Magi= new Home_Magi();
    public Fragment fragment_Login= new FragmentLogin();
    public Fragment fragment_Store=new Store_buy();
    private ViewPager viewPager;
    public static Context context;
    private ViewPagerAdapter viewPagerAdapter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Home_YGH(),"Home");
        viewPagerAdapter.addFragment(new Store_auction(), "Transfer");

        context= getApplicationContext();

        NavBottom();
        if(savedInstanceState == null){
            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            fr.replace(R.id.fragmento_padre, fragment_Login);
            fr.commit();
        }//le digo que fragment hacer default
    }

    public void NavBottom(){
        BottomNavigationView mMainNav = findViewById(R.id.bottom_navigation);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.action_home:
                        fr.replace(R.id.fragmento_padre, fragment_Home);
                        fr.addToBackStack(null);
                        fr.commit();
                        Toast.makeText(MainActivity.this, "Action home Clicked", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_store:
                        fr.replace(R.id.fragmento_padre, fragment_Store);
                        fr.addToBackStack(null);
                        fr.commit();
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

    @Override
    public void onFragmentInteraction(Uri uri) {
//         onFragmentInteraction;
    }
}
