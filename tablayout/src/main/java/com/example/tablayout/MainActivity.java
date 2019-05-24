package com.example.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {



        FrameLayout simpleFrameLayout;
        TabLayout tabLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            simpleFrameLayout = (FrameLayout) findViewById(R.id.simpleFrameLayout);
            tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);

            TabLayout.Tab firstTab = tabLayout.newTab();
            firstTab.setText("First");
            firstTab.setIcon(R.drawable.ic_launcher_background);

            tabLayout.addTab(firstTab);

            TabLayout.Tab secondTab = tabLayout.newTab();
            secondTab.setText("Second");
            secondTab.setIcon(R.drawable.ic_launcher_background);
            tabLayout.addTab(secondTab);

            TabLayout.Tab thirdTab = tabLayout.newTab();
            thirdTab.setText("Third");
            thirdTab.setIcon(R.drawable.ic_launcher_background);
            tabLayout.addTab(thirdTab);

//            Runnable tabLayout_config = new Runnable() {
//                @Override
//                public void run() {
//
//                    if(tabLayout.getWidth() < MainActivity.this.getResources().getDisplayMetrics().widthPixels)
//                    {
//                        tabLayout.setTabMode(TabLayout.MODE_FIXED);
//                        ViewGroup.LayoutParams mParams = tabLayout.getLayoutParams();
//                        mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
//                        tabLayout.setLayoutParams(mParams);
//
//                    }
//
//                    else
//                    {
//                        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//
//                    }
//
//
//                }
//            };


            tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {

                    Fragment fragment = null;
                    switch (tab.getPosition()) {
                        case 0:
                            fragment = new Fragment1();
                            break;
                        case 1:
                            fragment = new Fragment2();
                            break;
                        case 2:
                            fragment = new Fragmentthird();
                            break;
                    }
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.simpleFrameLayout, fragment);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    ft.commit();
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }

    }

