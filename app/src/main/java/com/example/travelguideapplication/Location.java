package com.example.travelguideapplication;

public class Location {
    private String mLocationName;
    private String mLocationDetail;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    Location(String locationName, String locationDetail) {
        mLocationDetail = locationDetail;
        mLocationName = locationName;
    }

    Location(String locationName, String locationDetail, int imageResourceId) {
        mLocationDetail = locationDetail;
        mLocationName = locationName;
        mImageResourceId = imageResourceId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmLocationDetail() {
        return mLocationDetail;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

