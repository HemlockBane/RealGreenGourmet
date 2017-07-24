package com.example.android.greengourmet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);
/**
 * This creates and populates an ArrayList of Display objects,
 */
        ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Eba", "Garri"));
        displayObject.add(new ItemList("Curry","Thyme"));
        displayObject.add(new ItemList("Cinnamon","Rosemary"));
        displayObject.add(new ItemList("Locust Beans", "Spinach"));


        Log.v("Ingredients", "Word at index 0:" + displayObject.get(0));
        Log.v("Ingredients", "Word at index 1:" + displayObject.get(1));
        Log.v("Ingredients", "Word at index 2:" + displayObject.get(2));

//        for (int index = 0; index < displayObject.size(); index++) {
//            TextView view = new TextView(this);
//            view.setText(displayObject.get(index));
//            listView.addView(view);0
//        }
        /**
         * This creates a DisplayAdapter object instance and a ListView object
         */


        ItemListAdapter listAdapter = new ItemListAdapter(this,displayObject);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);





    }
}
