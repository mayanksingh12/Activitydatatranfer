package com.example.tablayout2;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabchats;
    TabItem tabstatus;
    TabItem tabcall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar1);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tablayout);
        tabchats=findViewById(R.id.Tabchats);
        tabstatus=findViewById(R.id.tabstatus);
        tabcall=findViewById(R.id.tabcalls);
        viewPager=findViewById(R.id.viewpager);

        pageAdapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition()==1)
                {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorAccent));

                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
                    }
                }
                else if (tab.getPosition()==2)
                {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));

                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
                    }
                }
                else {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));

                    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }


}
