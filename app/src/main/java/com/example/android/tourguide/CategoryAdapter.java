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
        else if(position==1)
            return mContext.getString(R.string.Restaurants);
        else if(position==2)
            return mContext.getString(R.string.Events);
        else
        return mContext.getString(R.string.publicPlaces);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new AttractionsFragment();
        else if (position==1)
            return new RestaurantsFragment();
        else if(position==2)
            return new EventsFragment();
        else
        return new PublicFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
