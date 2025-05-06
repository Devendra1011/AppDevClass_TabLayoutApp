package com.devdeveloper.tablayoutapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[]  tabNameArray;


    // constructor
    public ViewPagerAdapter(@NonNull FragmentManager fm, String[] tabNameArray) {
        super(fm);
        this.tabNameArray = tabNameArray;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabNameArray.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return  tabNameArray[position];
    }
}
