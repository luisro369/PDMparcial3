package com.luisro00005513.pdmparcial3.Fragments;

import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.pdmparcial3.R;

/**
 * Created by UCA on 10/07/2018.
 */

public class Fragment_Home extends Fragment {
    private static final int NUM_PAGES = 2;
    //viewPager widget
    private ViewPager mPager;
    //pager adapter, provee las paginas al view pager widget
    private PagerAdapter mPagerAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frament_home, container, false);
        // Instantiate a ViewPager and a PagerAdapter.
        //======================todos sobre el tab====================
        //========================================
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Yu-Gi-Oh"));
        tabLayout.addTab(tabLayout.newTab().setText("Magi"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //codigo para viewpager
        mPager = (ViewPager) view.findViewById(R.id.viewPagerHome);
        mPagerAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        mPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        return view;
    }



    //clase del pager adapter
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Home_YGH tab1 = new Home_YGH();
                    return tab1;
                case 1:
                    Home_Magi tab2 = new Home_Magi();
                    return tab2;

                default:
                    return null;
            }//switch
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
