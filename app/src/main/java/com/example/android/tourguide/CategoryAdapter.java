package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.Attractions);
        else
            return mContext.getString(R.string.Restaurants);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new AttractionsFragment();
        else
            return new RestaurantsFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
