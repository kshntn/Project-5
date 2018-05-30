package com.example.android.tourguide;

import android.location.Address;

public class Details {
    private String mName;
    private String mDescription;
    private int mImageId;
    private String mTime;
    private String mOwners;
    private String mAddress;

    public Details(String Name, String Description, int ImageId, String Time, String Address) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;
        mTime = Time;
        mAddress = Address;
    }

    public Details(String Name, String Description, int ImageId, String Time, String Owners, String Address) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;
        mTime = Time;
        mOwners = Owners;
        mAddress = Address;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmOwners() {
        return mOwners;
    }

    public String getmAddress() {
        return mAddress;
    }
}
