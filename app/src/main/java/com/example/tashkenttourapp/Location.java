package com.example.tashkenttourapp;

public class Location {

    private int mTitleId;
    private int mAddressId;
    private int mImageId=NO_PHOTO;
    private static final int NO_PHOTO=-1;

    public Location(int titleId, int addressId,int imageId){
        mTitleId=titleId;
        mAddressId=addressId;
        mImageId=imageId;
    }

    public int getTitleId() {
        return mTitleId;
    }

    public int getAddressId() {
        return mAddressId;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage(){
        return mImageId !=NO_PHOTO;
    }

}
