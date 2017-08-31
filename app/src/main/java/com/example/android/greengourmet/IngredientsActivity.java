package com.example.android.greengourmet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class IngredientsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
/**
 * This creates and populates an ArrayList of Display objects,
 */
        ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Eba", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Curry", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Cinnamon", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Locust Beans", R.drawable.ic_face_teal_500_24dp));


        Log.v("Ingredients", "Word at index 0:" + displayObject.get(0));
        Log.v("Ingredients", "Word at index 1:" + displayObject.get(1));
        Log.v("Ingredients", "Word at index 2:" + displayObject.get(2));


//        }
        /**
         * This creates a DisplayAdapter object instance and a ListView object
         */


        ItemListAdapter listAdapter = new ItemListAdapter(this,displayObject);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(IngredientsActivity.this, MarketActivity.class);
                startActivity(intent);
            }
        });


    }
}
