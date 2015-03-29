package com.kite.joco.kitecrmdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Joco on 2015.03.23..
 */
public class CrmViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments ;

    public CrmViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments = new ArrayList<Fragment>();
        fragments.add(new FragmentDashBoard());
        fragments.add(new FragmentTodos());
        fragments.add(new FragmentDescription());
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return FragmentDashBoard.TAG;
            case 1:
                return FragmentTodos.TAG;
            case 2:
                return FragmentDescription.TAG;
            default:
                return null;
        }

    }

}
