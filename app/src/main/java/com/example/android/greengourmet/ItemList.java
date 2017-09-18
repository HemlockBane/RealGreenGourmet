package com.example.android.greengourmet;

/**
 * Created by Polymath on 01/07/2017.
 */

public class ItemList {
    private String firstItemName;
    private String secondItemName;
    private int mImageResourceId;

    public ItemList(String itemOne, String itemTwo, int imageResourceId) {

        firstItemName = itemOne;
        secondItemName = itemTwo;
        mImageResourceId = imageResourceId;

    }

    public ItemList(String itemOne, int imageResourceId) {

        firstItemName = itemOne;
        mImageResourceId = imageResourceId;

    }

    public String getFirstItemName() {
        return firstItemName;
    }

    public String getSecondItemName() {
        return secondItemName;
    }


    public int getImageResourceId() {
        return mImageResourceId;

    }
}

