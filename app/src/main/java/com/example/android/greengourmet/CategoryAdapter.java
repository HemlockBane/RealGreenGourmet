package com.example.android.greengourmet;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Polymath on 01/09/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private Context mContext;


    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
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
        return PAGE_COUNT;
    }


//    private String tabTitles[] = new String[] {mContext.getString(R.string.cuisine_name)
// ,mContext.getString(R.string.ingredient_name)
// , mContext.getString(R.string.market_name) };

//        @Override
//    public CharSequence getPageTitle(int position) {
//        return null;
//        if (position == 0) {
//            return mContext.getString(R.string.cuisine_name);
//        } else if (position == 1) {
//            return mContext.getString(R.string.ingredient_name);
//        } else {
//            return mContext.getString(R.string.market_name);
//        }
//    }


//    @Override
//    public CharSequence getPageTitle(int position) {
//        return tabTitles[position];
//    }


}
