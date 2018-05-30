package com.example.android.tourguide;

public class Details {
    private String mName;
    private String mDescription;
    private int mImageId;
    private String mTime;
    private String mOwners;
    public Details(String Name, String Description, int ImageId) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;

    }
    public Details(String Name, String Description, int ImageId, String Time,String Owners) {
        mName = Name;
        mDescription = Description;
        mImageId = ImageId;
        mTime = Time;
        mOwners=Owners;
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
}
