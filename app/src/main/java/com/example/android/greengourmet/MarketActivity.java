package com.example.android.greengourmet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
/**
 * This creates and populates an ArrayList of Display objects,
 */
        ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Yaba", R.drawable.ic_near_me_teal_500_24dp));
        displayObject.add(new ItemList("Abule Oja", R.drawable.ic_near_me_teal_500_24dp));
        displayObject.add(new ItemList("Bariga", R.drawable.ic_near_me_teal_500_24dp));
        displayObject.add(new ItemList("Ojuelegba", R.drawable.ic_near_me_teal_500_24dp));


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


        MarketListAdapter listAdapter = new MarketListAdapter(this, displayObject);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MarketActivity.this, "Test", Toast.LENGTH_SHORT).show();

                Intent bikeIntent = new Intent(MarketActivity.this, DirectionActivity.class);
                startActivity(bikeIntent);
//


            }
        });


    }
}

