package com.hegazy.garageqatar.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerDeskavreAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragments = new ArrayList<>();

    public ViewPagerDeskavreAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);
        fragments = new ArrayList<>();

    }

    public void addPager(Fragment fragments) {
        this.fragments.add(fragments);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return fragments.size();
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    // Returns the page title for the top indicator
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return fragmentsTitle.get(position);
//    }
}
