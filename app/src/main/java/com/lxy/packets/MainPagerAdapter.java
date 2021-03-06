package com.lxy.packets;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Fragment []mFragments;
    private String[] mTitle;

    public MainPagerAdapter(FragmentManager fm,Fragment[] fragments,String []title) {
        super(fm);
        mFragments=fragments;
        mTitle=title;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle[position];
    }
}
