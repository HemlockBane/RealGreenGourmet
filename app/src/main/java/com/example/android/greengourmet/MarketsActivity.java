package com.example.android.greengourmet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MarketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Yem Yem", "Yaba", R.drawable.ic_shopping_basket_grey_600_24dp));
        displayObject.add(new ItemList("Citydia", "Abule Oja", R.drawable.ic_shopping_basket_grey_600_24dp));
        displayObject.add(new ItemList("Justrite", "Bariga", R.drawable.ic_shopping_basket_grey_600_24dp));
        displayObject.add(new ItemList("Grocery Bazaar", "Ojuelegba", R.drawable.ic_shopping_basket_grey_600_24dp));


        Log.v("Ingredients", "Word at index 0:" + displayObject.get(0));
        Log.v("Ingredients", "Word at index 1:" + displayObject.get(1));
        Log.v("Ingredients", "Word at index 2:" + displayObject.get(2));


        /**
         * This creates a DisplayAdapter object instance and a ListView object
         */


        MarketListAdapter listAdapter = new MarketListAdapter(this, displayObject);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MarketsActivity.this, "Test", Toast.LENGTH_SHORT).show();

                String[] itemName = getResources().getStringArray(R.array.Place);
                final String activity = itemName[position];

                Intent intent = new Intent(MarketsActivity.this, DirectionActivity.class);
                intent.putExtra("itemName", activity);
                startActivity(intent);
//


            }
        });
    }
}