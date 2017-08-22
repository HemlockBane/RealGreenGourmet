package com.example.android.greengourmet;

/**
 * Created by Polymath on 01/07/2017.
 */

public class ItemList {
    private String firstItemName;

    private int mImageResourceId;

    public ItemList (String itemOne, int imageResourceId ){

        firstItemName = itemOne;
        mImageResourceId = imageResourceId;

    }

    public String getFirstItemName() {
        return firstItemName;
    }


    public int getImageResourceId()
    {
        return mImageResourceId;

    }
}
