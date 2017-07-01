package com.example.android.greengourmet;

/**
 * Created by Polymath on 01/07/2017.
 */

public class ItemList {
    private String firstItemName;

    private String secondItemName;

    public ItemList (String itemOne, String itemTwo ){

        firstItemName = itemOne;
        secondItemName = itemTwo;

    }

    public String getFirstItemName() {
        return firstItemName;
    }

    public String getSecondItemName() {
        return secondItemName;
    }
}
