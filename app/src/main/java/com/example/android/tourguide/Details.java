package com.example.android.tourguide;

public class Details {
    private String mName;
    private String mDescription;
    private int mImageId;

    public Details(String Name,String Description,int ImageId){
        mName=Name;
        mDescription=Description;
        mImageId=ImageId;
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
}
