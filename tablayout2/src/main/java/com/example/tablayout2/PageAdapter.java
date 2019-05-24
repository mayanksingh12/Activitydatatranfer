package com.example.tablayout2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int noOfTabs;
    public PageAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs=noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Chat();
            case 1:
                return new Status();
            case 2:
                return new Call();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
