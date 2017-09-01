package com.example.android.greengourmet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Polymath on 01/09/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new CuisineFragment();
        } else if (position == 1) {
            return new IngredientsFragment();
        } else {
            return new MarketFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}
